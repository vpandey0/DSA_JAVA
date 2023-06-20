package temp;


public class new_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test obj=new test(); 
//		When the object of Test class is created,the constructor with no arguments is called.
//		When  this(10,20) is encountered , the constructor with two arguments int and int is 
//		called because this is the reference of the object. So using this way we can call more than one constructor.

//-> Question-2
//		test st=new test();
//		st.setMarks(78);
//		System.out.println(test.marks);
		
//	-> Question-3
//		test t=new test();
//		t.fun();
//		System.out.println(test.b);
//		System.out.println(test.a +test.b);
		
//	-> Question-4
//		test.fun1();
		
//  -> Question-5
//		test t=new test();
//		t.price=16;
//		System.out.println(b.price);//price is a final field, thus statement “ b.price = 16 “ is incorrect 
//		since we cannot re assign a final variable
		
//	-> Question-6
        System.out.print(test.count + " ");
        test b1 = new test(500);
        test b2= new test(600);
        System.out.println(test.count);
 
	}

}
