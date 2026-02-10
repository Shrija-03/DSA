import java.util.*;
public class SecondMin {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter n: ");
	    int n = sc.nextInt();
	    
	    int arr[] = new int[n];
	    
	    int min = Integer.MAX_VALUE;
	    
	    for(int i=0;i<n;i++){
	         arr[i] = sc.nextInt();
	        
	        if(min > arr[i]){
	            min = arr[i];
	        }
	    }
	    int secondMin = Integer.MAX_VALUE;
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]!=min && secondMin > arr[i]){
	            secondMin = arr[i];
	        }
	    }
	    System.out.print("secondMin: "+secondMin);
	}
}
