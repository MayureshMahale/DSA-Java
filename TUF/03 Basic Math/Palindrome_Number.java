class Solution {
    public boolean isPalindrome(int n) {
        int num=n;
        int revnum=0;
        while(num>0){
           
            int lastdigit= num % 10 ;
            revnum= (revnum * 10 )+lastdigit;
            num=num/10;
        }
        if(n==revnum){
            return true;
        }
        else{
            return false;
        }
    }
}