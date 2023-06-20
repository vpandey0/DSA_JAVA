package class_and_object;

public class Fraction {
	private int num;
	private int deno;
	
	public Fraction(int num, int deno) {
	
		this.num=num;
		if(deno==0) {
			// todo error out
			
		}
		this.deno=deno;
		simplify();
	}
	public int getNumerator() {
		return num;
	}
	public int getDenominator() {
		return deno;
	}
	public void setNumerator(int num) {
		this.num=num;
		simplify();
	}
	public void setDenominator(int deno) {
		if(deno==0) {
			//TODO error out
			return;
		}
		this.deno=deno;
		simplify();
	}
   public void print() {
	   if(deno==1) {
		   System.out.println(num);
	   }else {
		   System.out.println(num + "/" +deno);
	   }
   }

   public static Fraction add(Fraction f1, Fraction f2) {
	   int newNum=f1.num *f2.deno + f1.deno *f2.num;
	   int newDen=f1.deno * f2.deno;
	   Fraction f= new Fraction(newNum, newDen);
	   return f;
   }
   public void add(Fraction f2) {
	   this.num=this.num *f2.deno +this.deno*f2.num;
	   this.deno=this.deno*f2.deno;
	   simplify();
   }
   public void multiply(Fraction f2) {
	   this.num=this.num * f2.num;
	   this.deno=this.deno * f2.deno;
	   simplify();
   }
   
   
	private void simplify() {
	int gcd=1;
	int smaller=Math.min(num,deno);
	for(int i=2;i<=smaller;i++) {
		if(num%i==0 && deno%i==0) {
			gcd=i;
		}
	}
	num=num/gcd;
	deno=deno/gcd;
	
}


}
