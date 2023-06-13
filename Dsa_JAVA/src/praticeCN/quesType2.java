package praticeCN;
import java.util.*;
public class quesType2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int num1[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			num1[i]=sc.nextInt();
//		}
//		
//		int num2[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			num2[i]=sc.nextInt();
//		}
//		int target=sc.nextInt();
      
      
//----Q- CHECK NUMBER SEQUENCE----------
		
//		 int a[]=new int[n];
//			for(int i=0;i<n;i++) {
//				int k=s.nextInt();
//				a[i]=k;
//			}
//	        
//	        boolean isdec=true;
//	        
//	        boolean ans=true;
//	        
//	        for(int i =0;i<n-1;i++) {
//				if(a[i]==a[i+1]) {
//					ans=false;
//					break;
//				}
//				else if(a[i]<a[i+1]) {
//					isdec=false;
//				}
//				else if(a[i]>a[i+1] && isdec==false) {
//					ans=false;
//				}
//				
//			}
//			System.out.println(ans);
//		
		
		String str1="abcd";
		String str2="abdc";
		
//		char []ch=new char[26];
//        if(str1.length()!=str2.length()){
//            System.out.println("False");
//        }
//        for(int i=0;i<ch.length;i++){
//          ch[str1.charAt(i)-'a']++;
//          ch[str2.charAt(i)-'a']--;
//        }
        int c=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				System.out.println(true);
				c++;
				break;
				
			}
			c=0;
		}
		System.out.println(c);
	       
}

}
