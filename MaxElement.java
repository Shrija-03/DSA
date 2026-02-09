import java.util.*;
public class MaxElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){
		    int temp = sc.nextInt();
		    if(max < temp){
		        max = temp;
		    }
		}
		
// 		int max = arr[0];
// 		for(int i=1;i<n;i++){
// 		    if(max < arr[i]){
// 		        max  = arr[i];
// 		    }
// 		}
		
		System.out.print("max: " +max);
	}
}
