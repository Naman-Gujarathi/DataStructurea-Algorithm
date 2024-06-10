class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long exponential = n;
        if(n<0){
            exponential = Math.abs(exponential);
        }
        while(exponential > 0) {
            if(exponential % 2 == 0){
                x = x*x;
                exponential = exponential/2;
            } else {
                result = result * x;
                exponential = exponential-1;
            }
        }
        if(n<0){
            result = 1.0/result;
        }
        return result;
    }
}