class Solution {
    public int primeUptoN(int n) {
        int count=0;
        int zero=0;

        for (int i=1; i<=n; i++){
            int divisor=0;

            for (int j=1; j<=i; j++){
                if(i%j==zero){
                    divisor++;
                }
            }

            if(divisor==2){
                count++;
            }
        }

        return count;
    }
}