package ex07_jdbc;

import java.util.Date;

public class EmployeeDTO {

	private int salary;
	private String first_name;
	private int employee_id;
	private Date hire_date;
	
	
	
	
	
	
	public EmployeeDTO(int salary, String first_name, int employee_id, Date hire_date) {
		super();
		this.salary = salary;
		this.first_name = first_name;
		this.employee_id = employee_id;
		this.hire_date = hire_date;
	}

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	


	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [salary=" + salary + ", first_name=" + first_name + ", employee_id=" + employee_id
				+ ", hire_date=" + hire_date + "]";
	}


	
	
	
	
	
}
