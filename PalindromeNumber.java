import java.util.*;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int original = n;
		int rev=0;
		while(n>0){ 
		   int rem = n%10;
		   rev = rev*10 + rem;
		   n/=10;
		}
		System.out.println(original == rev ? "palindrome" : "not palindrome");
	}
}
