class Solution{
   
    public void printX(int X, int N) {
        for (int i = 0; i < N; ++i) {
            System.out.print(X);
            
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
        
        
        System.out.println();
    }
}
