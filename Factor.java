import java.util.*;
public class Factor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		
// 		int n =sc.nextInt(); //18
		int n = (int)(Math.pow(2,32)); //18
		
        System.out.println("number:"+n);
		int count = 2; // 1 18
		
		int sqrt = (int)(Math.sqrt(n)); // 9*2=>3*3*2=>3(2)=3*1.414 = 4
		
		for(int i=2; i<sqrt;i++){ //2->3
		    if(n%i==0){ //18%2 = 0(18/2=9 | 2,9), 18%3=0 (18/3=6 | 3,6)
		        count = count + 2; // 2+2=4  4+2=6
		    }
		} //1,18,2,9,3,6
		System.out.println("count of divisors: "+count);
	}
}
