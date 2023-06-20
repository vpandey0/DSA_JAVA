package temp;

public class test {
//int a;
//int b;
//test(){
//	this(10,20);
//	System.out.println("cons 1");
//}
//test(int a, int b){
//	this.a=a;
//	this.b=b;
//	System.out.println("cons 2");
//}

//-> Question-2
//	static int marks;
//	void setMarks(int marks) {
//		this.marks=marks;
//	}
//-> Question-3
//	static int a=10;
//	static int b;
//	static void fun() {
//		b=a*4;
//	}
//-> QUESTION-4
//	static int a=10;
//	int b=20;
//	static void fun1() {
//		a=20;
//		b=10;//static functions cannot use non-static variables.
//		fun2();//Static function cannot call non-static function.
//		System.out.println(this.b);//this or super keyword cannot be used inside a static function.
//	}
//	void fun2() {
//		System.out.println("from m2");
//	}
	
// -> Question-5
// final int price=10;
	
// -> Question-6

    int price;
    static int count; 

    public test(int price) {
        this.price = price;
        count++;
    }    
//  Which of the modifier can't be used for constructors ?
// Ans- Static
	
}
