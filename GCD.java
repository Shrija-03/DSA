public class GCD{
	public static void main(String[] args) {
		System.out.println(gcd(8,38));
	}
	public static int gcd(int a , int b){ // 1{a=8,b=38}, 2->{a=38,b=8} 3->{a=8,b=6} 4->{a=6,b=2} 5->{a=2,b=0}
          if(b==0) { // 1->b=38,2->b=8, 3->b=6,  4->b=2,  5->b=0
              return a; // 2
          }
          return gcd(b,(a%b)); // 1->{a=38,b=8%38=>8}, 2->{a=8,b=38%8=>6}, 3->{a=6,b=8%6=>2} 4->{a=2,b=6%2=>0}
    }
}
