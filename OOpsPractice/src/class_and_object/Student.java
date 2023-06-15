package class_and_object;

public class Student {
 String name;
 public int rollNo;
 private int age;
 
 public void setAge(int n) {
	 
	if(age<0) {
		return;
	}
	age=n;
}
  public int getAge() {
	  return age;
  }
  
  //Constructor
  public Student(String n,int ag) {
	  name=n;
	  age=ag;
	  
  }
	  
 }
 

