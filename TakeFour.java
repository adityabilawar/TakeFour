import java.util.Arrays;


public class TakeFour {

	static int []b;
	public static void takeFour(int[] a){
	
		
		  for(int i=0; i < a.length; i++){
			if(i+4<a.length-1) {
			  			a[i] = a[i+1] + a[i+2] + a[i+3] + a[i+4];
			}
		        }

		
		}
		    
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 7, 3, 9, 6, 9, 4, 8, 11, 0, 13, 8, 9, 1, 7, 5, 2, 6};
		System.out.println(Arrays.toString(arr));
		takeFour(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}