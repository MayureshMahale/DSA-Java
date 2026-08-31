class Solution {
    public List<Integer> leaders(int[] nums) {
         List<Integer> res = new ArrayList<>();
        
        if (nums.length == 0) {
            return res;
        }
        
        int max = nums[nums.length - 1];
        res.add(nums[nums.length - 1]);
        
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                res.add(nums[i]);
                max = nums[i];
            }
        }
        
        Collections.reverse(res);
        return res;
    }
}