package praticeCN;
import java.util.*;
public class quesType1 {
	double a = 6.7;
//  double b  = 2.1;
//  double c = a %b;
//	char c='a';
//	int i='c';;
//  System.out.println(i);
//	  int x=5;
//	    int y=5;
//	    while((x=5)==y)
//	    {
//	        System.out.println("Hello");
//	        x++;
//	        y++;
//	    }
//	Scanner s=new Scanner (System.in);
//  int n=s.nextInt();
//  boolean isprime=true;
//  if(n%2==0)
//      isprime=false;
//  int i=3;
//  while(isprime&&i<n)
//  {
//      isprime=!(n%i==0);
//      System.out.print(isprime);
//      i+=2;
//  }
//  if(isprime)
//  {
//      System.out.println("Prime");
//  }
//  else
//  {
//      System.out.println("Composite");
//  }
  
//	 int a=10,b=50;
//	    a++;
//	    --b;
//	    int c=a--+b--;
//	    System.out.print(++c);
	
//	int a=10,b=20;
//  System.out.println(a+++--b);//line 1
//  System.out.println(a--+++b);//line 2
//  System.out.println(a++-++b);//line 3
//  System.out.println(a+++++b);//line 4
	
//	int a=10,b=20;
//  int c=a&b;
//  System.out.println(c);
//  int d=a|b;
//  System.out.println(d);
//  int e=a^b;
//  System.out.println(e);
//  int f=c+d+e;
//  System.out.println(f);
//  System.out.println(~f);
	
//	   int a=10,b=-20;
//	   System.out.println(Integer.toBinaryString(b));
//	   
//	    System.out.println(Integer.toBinaryString(a^b));
	    
//  int x , y = 1;
//  x = 10;
//  if (x != 10 && x / 0 == 0)
//      System.out.println(y);
//  else
//      System.out.println(++y);
//  int x =10;
//  int y = 20;
//  if(x++ > 10 && ++y > 20 ){
//  System.out.print("Inside if  ");
//  }else{
//  System.out.print("Inside else  ");
//  }
//  System.out.println(x +" "+y);
//  int a=10;
//  a+=++a-5/3+6*a;
//  System.out.print(a);
	
//	int i=0;
//  for(;;)
//  {
//      if(i==5)
//          break;
//      System.out.print(i);
//      i++;
//  }
	Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  for(int i=2;i<n;i++){
      
      if(n%i!=0){
      System.out.println(i);
      }
     
  }

	

}
