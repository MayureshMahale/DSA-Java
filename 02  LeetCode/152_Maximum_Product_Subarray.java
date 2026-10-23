class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        long maxpro = Long.MIN_VALUE;
        long pro = 1;

        for (int i = 0; i < n; i++) {
            pro=pro*nums[i];
            maxpro=Math.max(maxpro, pro);
            if(pro == 0) {
                pro=1;
            }
        }
        pro = 1;
        for (int i=n-1;i>=0;i--) {
            pro= pro*nums[i];
            maxpro = Math.max(maxpro, pro);
            if (pro==0) {
                pro=1;
            }
        }
        return (int) maxpro;
    }
}