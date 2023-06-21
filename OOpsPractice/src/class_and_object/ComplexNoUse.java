package class_and_object;
import java.util.Scanner;
public class ComplexNoUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int real1 = sn.nextInt();
		int imaginary1 = sn.nextInt();
        
		int real2 = sn.nextInt();
		int imaginary2 = sn.nextInt();

		ComplexNo c1 = new ComplexNo(real1, imaginary1);
		
		ComplexNo c2 = new ComplexNo(real2, imaginary2);
        
		int choice = sn.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
		}

}
