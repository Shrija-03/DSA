
public class LCM{
    
	public static void main(String[] args) {
		System.out.println(lcm1(9,2));
		lcm2(4,8);
	}
	
	public static int lcm1(int a, int b) {
	    int max = a > b ? a : b;
	    
	    while(true){
	        if(max%a==0 && max%b==0){
	            return max;
	        }
	        max=max+1;
	    }

    }
    
    public static void lcm2(int a, int b) {
	    int max = a > b ? a : b; // 9
	    
	    while(max%a!=0 || max%b!=0){ // {9%2!=0 || 9%9=0} {10%2=0 || 10%9!=0} {11%2!=0 || 11%9!=0} {12%2=0 || 12%9!=0}
	                                 // {13%2!=0 || 13%9!=0} {14%2=0 || 14%9!=0} {15%2!=0 || 15%9!=0} {16%2=0 || 16%9!=0}
	                                 // {17%2!=0 || 17%9!=0} {18%2=0 || 18%9=0}
	        max++; // 10 11 12 13 14 15 16 17 18
	    }
	    System.out.println(max); // 18
	    
	}

}
