package java_session6;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	Student(int id, String name, char g) //constructor
	{
		sid=id;
		sname=name;
		grade=g;
	}
	void getValue(int id, String name, char g)// method
	{
		sid=id;
		sname=name;
		grade=g;
	}
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	

}
