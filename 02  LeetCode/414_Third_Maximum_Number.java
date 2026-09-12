class Solution {
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        
        for(int num:nums){
            if(num>first){
                first=num;
            }
        }
        for(int element:nums){
            if(element>second && element<first){
                second=element;
            }
        }
        for(int value:nums){
            if(value>third && value<second && value<first){
                third=value;
            }
        }
        if(third<Integer.MIN_VALUE){
            return (int)first;
        }
        return (int)third;
    }
}