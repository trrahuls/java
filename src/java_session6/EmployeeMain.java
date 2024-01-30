package java_session6;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		emp1.empid=101;
		emp1.empName="Sandeep";
		emp1.departNo=201;
		emp1.job= "Sofware Tester";
		
		emp1.display();
		
		Employee emp2= new Employee();
		emp2.empid=102;
		emp2.empName="Rahul";
		emp2.departNo=201;
		emp2.job= "Sofware Tester";
		
		emp2.display();

	}

}
