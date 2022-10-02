package com.question4;

public class Department {
    
	private int departmentId;
	private String departmentName;
	
	public Department() {
		
	}
	
	public Department(int id, String name) {
		
		this.departmentId = id;
		this.departmentName = name;
		
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	
	
}
