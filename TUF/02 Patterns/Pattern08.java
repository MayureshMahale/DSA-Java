class Solution {
    public static void pattern8(int n) {
        for (int i=0;i<n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*n-1-(2*i));j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }     
    public static void main(String[] args) {
        int N = 5;

        
        Solution sol = new Solution();

        sol.pattern8(N);
    }
}
