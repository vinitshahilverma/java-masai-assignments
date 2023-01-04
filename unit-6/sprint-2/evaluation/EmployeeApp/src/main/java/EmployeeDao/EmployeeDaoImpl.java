package EmployeeDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.Exception.DepartmentException;
import com.Exception.EmployeeException;
import com.masai.beans.Department;
import com.masai.beans.Employee;
import com.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {

           EntityManager em = EMUtil.provideEntityManager();
           
           em.getTransaction().begin();
   
           em.persist(dept);
           
           em.getTransaction().commit();
           
           System.out.println("Done...");
           
           em.close();
		
	}

	@Override
	public void addEmployee(Employee emp) {
		
		EntityManager em = EMUtil.provideEntityManager();
        
        em.getTransaction().begin();

        em.persist(emp);
        
        em.getTransaction().commit();
        
        System.out.println("Done...");
        
        em.close();
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {

             EntityManager em = EMUtil.provideEntityManager();
             
             Department dept = em.find(Department.class, deptId);
             Employee emp = em.find(Employee.class,empId);
             
             if(dept==null) {
            	 throw new DepartmentException("Department Not Found...");
             }
             if(emp==null) {
            	 throw new EmployeeException("Employee not found..");
             }
             
             else {
            	 
            	 emp.setDepartment(dept);
            	 dept.getEmployee().add(emp);
            	 
            	 em.getTransaction().begin();
            	 
            	 em.persist(emp);
            	 
            	 em.getTransaction().commit();
            	 
            	 System.out.println("Done....");
            	 
            	 em.close();
            	 
             }
             
            
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		List<Employee> emp = null;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Department where deptName=:name";
		
		 TypedQuery<Department> q = em.createQuery(jpql,Department.class);
		 
		 q.setParameter("name", deptName);
		 
		 Department dept = q.getSingleResult();
		 
		  emp = dept.getEmployee();
		
		  if(emp.size()==0) {
			  
			  throw new EmployeeException("Employee not found..");
		  }
		
		return emp;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		  Department dept = null;
		  
		  EntityManager em = EMUtil.provideEntityManager();
		  
		  
		     Employee emp = em.find(Employee.class,empId);
		     
		     if(emp!=null) {
		    	 
		    	 dept = emp.getDepartment();
		    	 
		    	 if(dept==null) {
		    		 throw new DepartmentException("Depatement not found...");
		    	 }
		    	 
		     }
		     else {
		    	 throw new DepartmentException("Employee not found...");
		     }
		  
		  
		  return dept;
	}

}
