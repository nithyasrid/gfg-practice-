// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int sign = (n<0)?-1:1;
        n = Math.abs(n);
        int rev =0 ;
        while(n!=0){
            int last = n%10;
            rev = rev * 10 + last;
            n= n/10 ;
        }
        return sign*rev;
        
    }
}