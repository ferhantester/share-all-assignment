package pkg1;

public class student {
	int age;
	int rollno;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	
 public void display2()
 
 {
	 System.out.println("Automation is very easy");
 }
 
 public static void main(String[] args) 
 {
	

 student ferhan=new student();
 ferhan.display1();
 ferhan.display2();
 ferhan.age=12;
 ferhan.rollno=1234;
 System.out.println(ferhan.age);
 System.out.println(ferhan.rollno);
 }
 
}
