import java.util.*;
public class AmstrongNumber {    
    
   public static int cnt = 0;
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n: ");
	    int n = sc.nextInt();
	   // System.out.println("count: " +count(n));
	   int count = count(n);
	    System.out.println(isAmstrong(n,count) ? "Amstrong number" : "Not Amstrong");
	  
	}
	
	public static int count(int n){
	   System.out.println("The count function is called: " + ++cnt);
	    int count = 0;
	    while(n>0){
	        count = count + 1;
	        n/=10;
	    }
	    return count;
	}
	public static boolean isAmstrong(int n, int count){
	    long sum = 0;
	    int original = n;
	   // int count = count(original);
	    while(n>0){
	        int rem = n%10;
	        sum = sum + (long)(Math.pow(rem,count));
	        n = n/10;
	    }
	    return sum == original;
	}
}
