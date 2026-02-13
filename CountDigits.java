import java.util.*;

public class CountDigits
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
	    int n = sc.nextInt();
	    
	    int count = 0;
	    
	    while(n > 0){           //1929>0 192>0  19>0  1>0     0>0
	        int rem = n % 10;   // 9      2      9    1%10=1
	        count = count + 1;  // 1      1      1    1
	        n = n/10;           // 192  192/10=19  19/10=1  1/10=0
	    }
	    System.out.println("Count: "+count);
	}
}
