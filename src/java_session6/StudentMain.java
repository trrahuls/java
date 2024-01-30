package java_session6;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1= new Student(101,"Sandeep",'A'); // Assign value by using constructor
		
		// assign value by using reference variable
		/*stu1.sid=101;
		stu1.sname= "Rahul";
		stu1.grade='A';*/
		
		// assign value by using method
		stu1.getValue(101,"Amit",'A');
		
		stu1.display();
	}

}
