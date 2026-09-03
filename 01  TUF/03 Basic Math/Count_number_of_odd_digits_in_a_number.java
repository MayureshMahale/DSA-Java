class Solution {
    public int countOddDigit(int n) {
        if(n == 0) {
            if(n%2 !=0)
            return 1;
        }

        int count = 0;

        while(n != 0) {
            if(n%2!=0){
                count++;
            }
            n = n / 10;
        }

        return count;
    
    }
}