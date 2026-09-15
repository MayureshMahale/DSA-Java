class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        List<Integer>result = new ArrayList<>();
        int n=nums.length;
        int i=0;
        while(i<n){
            int count=1;
            int j=i+1;

            while(j<n && nums[j]==nums[i]){
                count++;
                j++;
            }

            if(count>(n/3)){
                result.add(nums[i]);
            }

            i=j;
        }
    return result;

    }
}
