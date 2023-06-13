package pattern;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//     Pattern 1
//		int i=1;
//		
//		while(i<=4) {
//			int j=1;
//			while(j<=4) {
//				System.out.print(i);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Pattern-2
//		int i=1;
//		
//		while(i<=4) {
//			int j=1;
//			while(j<=4) {
//				System.out.print(j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Pattern-3
//		int i=1;
//		while(i<=n) {
////			int val=n;
//			int j=1;
//			while(j<=n) {
////				System.out.print(val+" ");
//				System.out.print(n-j+1);
//				j++;
////				val--;
//			}
//			System.out.println();
//			i++;
//		}
		
//		int i=1;
//		while(i<=n) {
//			int val=i;
//			int j=1;
//			while(j<=i) {
//				System.out.print(val+" ");
//				j++;
//				val++;
//
//			}
//			System.out.println();
//			i++;
//		}
		
//		int i=1;
//		int val=1;
//		while(i<=n) {
//			
//			int j=1;
//			while(j<=i) {
//				System.out.print(val+" ");
//				j++;
//				val++;
//
//			}
//			System.out.println();
//			i++;
//		}
		int i=1;
		while(i<=n) {
			int val=i;
			int j=1;
			while(j<=n) {
				System.out.print((char)('A'+val-1));
				j++;
				val++;
			}
			System.out.println();
			i++;
		}
		
		
		

	}

}
