class Solution {
    public boolean isPerfect(int n) {
        int numsum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                numsum=numsum+i;
            }
        }
        if(numsum==n){
            return true;
        }
        else{
            return false;
        }
      
    }
}