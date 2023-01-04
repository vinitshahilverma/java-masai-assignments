package EmployeeDao;

import java.util.List;

import com.Exception.DepartmentException;
import com.Exception.EmployeeException;
import com.masai.beans.Department;
import com.masai.beans.Employee;

public interface EmployeeDao {
	
	public void addDepartment(Department dept);
	
	public void addEmployee(Employee emp);
	
	public void registerEmployeeTODepartment(int empId, int deptId)throws EmployeeException, DepartmentException;
    
	public List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException;
	
	public Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentException;
	

}
