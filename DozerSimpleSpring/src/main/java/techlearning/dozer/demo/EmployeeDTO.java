package techlearning.dozer.demo;

public class EmployeeDTO {
	private int id;
	 private String fullName;
	 private double salary;
	 
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", fullName=" + fullName + ", salary=" + salary + "]";
	}
}
