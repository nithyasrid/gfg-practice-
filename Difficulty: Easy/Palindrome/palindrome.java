class Solution {
    public static boolean isPalindrome(int n) {
        // code here
        int original = n;
        int reverse = 0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse *10+digit;
            n/=10;
            
        }
        return original == reverse;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean out = isPalindrome(n);
        System.out.println(out);
        sc.close();
        
    }
}