class Solution {
    public double myPow(double x, int n) {
        long N = n;
        long m=n;
        if(n<0){
            N=-N;
        }

        double ans = 1;
        while (N>0) {
            if (N%2==1) {
                ans*=x;
                N=N-1;
            }
            else{
                  x *= x;
                  N /= 2;
            }          
        }
        if(m<0){
            return 1/ans;
        }
        return ans;
    }
}
