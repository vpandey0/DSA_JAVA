package array;

public class RotateArr {
	ublic static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length;
        d=d%n;
        if(d<0){
           d+=n;
        }
            reverse(arr,0,n-1);
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);  
    }
    public static void reverse(int []arr,int l,int h){
        
        while(l<=h){
            int temp=arr[h];
            arr[h]=arr[l];
            arr[l]=temp;
            l++;
            h--;
        }
    }
    public static void main(String []args){
        
        int arr[]={1, 2, 3, 4,5, 6, 7};
        int d=2;
        rotate(arr,d);
        for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
        }
	}

}
