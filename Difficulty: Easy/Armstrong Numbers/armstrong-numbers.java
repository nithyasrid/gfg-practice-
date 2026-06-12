// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
       int k = String.valueOf(n).length();
       int sum =0;
       int num =n;
       while(n>0){
           int ld =n%10;
           sum+=Math.pow(ld,k);
           n/=10;
       }
       return sum == num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean output = armstrongNumber(n);
        System.out.print(output);
        sc.close();
        
    }
}