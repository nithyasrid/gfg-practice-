// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int result  = 0;
        int original = n;
        int digit= 0;
        int temp = n;
        while(temp!=0){
            temp/=10;
            digit++;
        }
        temp = n;
        while(temp!=0){
            int remainder = temp %10;
            result += Math.pow(remainder, digit);
            temp/=10;
        }
        return result == original ;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean output = armstrongNumber(n);
        System.out.print(output);
        sc.close();
        
    }
}