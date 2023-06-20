package class_and_object;
import java.util.*;
public class StudentUse {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
//	Student s1=new Student();
//	s1.name="Ankush";
//	System.out.println(s1.name);
	
//	s1.setAge(8);
//	System.out.println(s1.getAge());
	
//	Student s2=new Student("Anu", 3);// <- constructor
//	System.out.println(s2.name);
//	System.out.println(s2.getAge());
//	
	Student s3=new Student("Nemo", 30);
//	System.out.println(s3.name);
	
//	---- Now as you initialized the data member with final, you have to pass age as well
	Student s4=new Student("Final", 40);
//	System.out.println("s4: " + s4);
//	System.out.println(s4.name);
//	System.out.println(s4.getAge());
//	System.out.println(s3.numStudents);
//	System.out.println(s4.numStudents);
	System.out.println(Student.getNumStudents());
	
	

	
	
	
	

}
}
