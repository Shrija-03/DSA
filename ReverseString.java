import java.util.*;

public class ReverseString
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.next(); // abcd = 4
		
		int right = str.length() - 1; // 4-1 = 3
		String s = "";
		
		for(int i=0;i<str.length();i++){ //abcd => dabc =>dcab =>dcba=>
		    s+=str.charAt(right); // d c b a
		    right  = right - 1;   //3-1=2 2-1=1 1-1=0 0
		}
		System.out.println(s);
	}
}
