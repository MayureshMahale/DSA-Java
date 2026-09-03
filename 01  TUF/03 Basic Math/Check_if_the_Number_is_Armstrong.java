 import java.util.*;
 class Solution {
    private int countdigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public boolean isArmstrong(int n) {
        int totaldigit=countdigit(n);
        int sum=0;
        int copy=n;
        while(n>0){
            int lastdigit=n%10;
            sum+=Math.pow(lastdigit,totaldigit);
            n=n/10;
        }
        if(sum==copy){
            return true;
        }else{
            return false;
        }
    }
}