class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int sum=0;
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>it:mpp.entrySet()){
            int ele=it.getKey();
            int freq=it.getValue();
            if(freq==1){
                sum=sum+ele;
            }
        }
        return sum;
    }
}