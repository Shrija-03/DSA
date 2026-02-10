import java.util.*;
public class SecondMax {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter n: ");
	    int n = sc.nextInt();
	    
	    int arr[] = new int[n];
	    
	    int max = Integer.MIN_VALUE;
	    
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	        if(max < arr[i]){
	            max = arr[i];
	        }
	    }
	    
	    int secondMax = Integer.MIN_VALUE;
	    
	    for(int i=0; i<n; i++){
	      if(arr[i]!=max && secondMax < arr[i]){
	          secondMax = arr[i];
	      }
	    }
	    System.out.print("secondMax: "+secondMax);
	}
}
