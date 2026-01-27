class EvenlyDivides {
    static int evenlyDivides(int n) {        
        int count = 0;
        int original = n;
        
        while(n>0){              // 2446 244  24 2 0
            int rem = n%10;      // 6      4  4  2
            if(rem!= 0 && original % rem == 0) {
                count++;
            }
            n/=10;               // 244  24   2  0
        }
        return count;
    }
}
