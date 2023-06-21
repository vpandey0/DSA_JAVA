package class_and_object;

public class ComplexNo {
	private int real;
	private int imaginary;
	
	public ComplexNo(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
//	public void setReal(int real) {
//		this.real=real;
//	}
//	public int getReal() {
//		return real;
//	}
//	public void setImg(int imaginary) {
//		this.imaginary=imaginary;
//	}
//	public int getImg() {
//		return imaginary;
//	}
	public void plus(ComplexNo c2){
		this.real=this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
		
	}
	public void multiply(ComplexNo c2){
		int r1=this.real*(c2.real) - imaginary*(c2.imaginary);
		imaginary=this.real*(c2.imaginary)+this.imaginary*(c2.real);
		this.real=r1;
		
	}
	public void print(){
		System.out.println(real + " + " + "i" + imaginary);
	}
	
}
