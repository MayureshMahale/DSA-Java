class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        Integer [] ans=mpp.keySet().toArray(new Integer[0]);
        Arrays.sort(ans,(a,b)->mpp.get(b)-mpp.get(a));
        int []result=new int [k];
        for(int i=0;i<k;i++){
            result[i]=ans[i];
        }
        return result;
    }
}