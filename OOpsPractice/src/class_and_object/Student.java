package class_and_object;

public class Student {
 String name;
 public int rollNo;
// private int age;
// Final data member can be initialized as soon as declared
 private final int age;
 private static int numStudents;
 
// public void setAge(int n) {
//	 
//	if(age<0) {
//		return;
//	}
//	age=n;
//}
  public int getAge() {
	  return age;
  }
  
  //Constructor, this keyword
  public Student(String name,int age) {
//	  name=n;
//	  age=ag;
//	  name=name;// Now here can't identify if whether name referring to data member or local variable, 
//	  age=age; // Hence we use this keyword
//	  System.out.println("this: " + this);
	  this.name=name;
	  this.age=age;
	  numStudents++;
	  
  }
  public static int getNumStudents() {
	  return numStudents;
  }
//  public Student(String n) {
//	  name=n;
//	  
//  }
  
  
	  
 }
 

