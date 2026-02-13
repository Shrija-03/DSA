import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1: ");
		String s1 = sc.next().toLowerCase();            //tryeh
		System.out.println("Enter s2: ");
		String s2 = sc.next().toLowerCase();           //uiegs
    
		Map<Character,Integer> map = new HashMap<>();
		if(s1.length() != s2.length()){
	    System.out.print("Not anagram");
        return;
		}
// 		if(s1.length() == s2.length()){  // 5==5
		    for(int i=0;i<s1.length();i++){  // tryeh
		        map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
		        // t - 0+1 = 1 
		        // r - 0+1 = 1 
		        // y - 0+1 = 1 
		        // e - 0+1 = 1
		        // h - 0+1 = 1
		    }
		    for(int i=0; i<s2.length(); i++){ //uiegs
		        char ch = s2.charAt(i); // u
		        int value = map.getOrDefault(ch,0); // 0
		        value--;                            // 0-1=-1
		        map.put(ch, value); // {u, -1}
		      if(value < 0){ // -1 < 0
		            System.out.print("Not anagram");
		            return;
		        }
		    }
// 		}
		System.out.println("anagram");
		System.out.println("map: "+map);	
	}
}
