package gayatri;
class Employee {
    String name;
	String jobTitle;
	double salary;
   Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
void calculateSalary(int months) {
		System.out.println("salary for months:" + (months * salary));
	}
void updateSalary(double newSalary) {
		salary = newSalary;
		System.out.println("salary is updated" + newSalary);
}}
public class Employee1 {
public static void main(String[] args) {
		Employee e = new Employee("Gayatri", "Web developer", 100000);
		e.calculateSalary(6);
		e.updateSalary(70000);
		e.calculateSalary(5);
	}

}
