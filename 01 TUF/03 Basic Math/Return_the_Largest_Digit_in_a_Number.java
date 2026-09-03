class Solution {
    public int largestDigit(int n) {
        int largest=0;
        while(n>0){
            int num=n%10;
            if(num>largest){
                largest=num;
            }
            n=n/10;
        }
        return largest;
    }
}