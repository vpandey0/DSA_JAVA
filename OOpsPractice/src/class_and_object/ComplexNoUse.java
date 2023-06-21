package class_and_object;
import java.util.*;
public class ComplexNoUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();
        
		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNo c1 = new ComplexNo(real1, imaginary1);
		
		ComplexNo c2 = new ComplexNo(real2, imaginary2);
        
		int choice = s.nextInt();
		 
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
		s.close();
	}

}
