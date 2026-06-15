class Solution {
    public void printTillN(int n) {
        // code here
        Scanner sc = new Scanner(System.in);
         if (n == 0) {
            return;
        }
        printTillN(n - 1);
        System.out.print(n + " ");
        
        
        
    }
}