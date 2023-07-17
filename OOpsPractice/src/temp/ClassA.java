package temp;

public class ClassA {
//	public static void main(String[] args){
//
//	    try{
//	       int a = 5/0;
//	    }
//	    catch(Exception e){
//	        System.out.print("Exception caught ");
//	    }
//	    catch(ArithmeticException e){
//	        System.out.print("Arithmetic Exception caught ");
//	   }
//	   finally{
//	       System.out.print("finally block");
//	   } 
//	 }
//	------------------------------------------------
//	public static void A(){
//        System.out.print("Good ");
//        throw new RuntimeException();
//    }
//    public static void B(){
//         A();
//         System.out.print("This ");
//    }
//    public static void main(String[] args){
//        try{
//           B();
//        }
//        catch(Exception e){
//           System.out.print("Time ");
//        }
//        finally{
//           System.out.print("at CodingNinjas");
//        }
//    }
//	------------------------------------------------
	public static void main(String[] args) {
    ClassA  b= new ClassA();
    b.show();
	}
}
	class Base {
	    public final void show() {
	        System.out.println("Base show");
	    }
	}
	class Derived extends Base {
	    public void show() { 
	        System.out.println("Derived show");
	    }
	}

	
}
	
