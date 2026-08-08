class Solution {
    
    public static void pattern7(int n) {
        
        for (int i = 0; i < n; i++) {
            
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;

      
        Solution sol = new Solution();

        sol.pattern7(N);
    }
}
