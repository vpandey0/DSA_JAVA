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
	
	Student s2=new Student("Anu", 3);// <- constructor
	System.out.println(s2.name);
	System.out.println(s2.getAge());

}
}
