import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
	    
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		
		String str = sc.next(); 
// 		String str = "malam";
		
		String revString = "";
// 		for(int i=str.length()-1;i>=0;i--){
// 		    revString+=str.charAt(i);
// 		}
// 		System.out.println("rev:" +revString);
// 		System.out.println(revString.equals(str) ? "palindrome" : "not palindrome");
		                           //malayalam
		                           //kalam
		int length = str.length(); // 9 -> 9-1 ->9-2->9-3 ->9-4
		                           // 5
// 		int idx = 1;
		for(int i = 0;i<length/2 ;i++){ // 0->1  =>kalak
		    if(str.charAt(i) != str.charAt(length-i-1)){ // k!=(5-0-1)->4(k) a!=(5-1-1)->3(a)
		    System.out.print("not palindrome");
		    return;
		    }
		}
		System.out.println("palindrome");
		//malayalam  
		//malayalam => 0-str.length()-1 - swap m
		//malayalam => 1-str.length()-2 - swap a
		//malayalam => 2-str.length()-3 - l 
		//malayalam => 3-str.length()-4 - a 
		
	}
}
