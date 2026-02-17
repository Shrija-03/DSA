import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
// 		int n = sc.nextInt();
		int n = (int)(Math.pow(2,32));
// 		int n = 5;
		System.out.println("number: "+n);

// 		int count = 0;

//run upto to half of number(number have factors to its half)
		for(int i=2; i<=n/2; i++){
		    if(n%i == 0){
		     System.out.println("not prime number");
		     break;
		      //  count++;
		    }
		}
		System.out.println("prime number");
	}
}
