class Solution {
    public void pattern5(int n) {
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=4;

        Solution sol = new Solution();
        sol.pattern5(n);
    }
}