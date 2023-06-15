package temp;
import class_and_object.Student;
public class StudentUse2 {

	public static void main(String[] args) {
     Student s=new Student();
     //s.name="Shidhant"; // -> here name is not visible becos the access set for this is default in Student class.
     s.rollNo=123;//-> it is accessible as rollNo is Public
     System.out.println(s.rollNo);
     
	}

}
