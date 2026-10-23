class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        long totalsum = 0;

        long maxsum = Long.MIN_VALUE;
        long currentmax = 0;

        long minsum = Long.MAX_VALUE;
        long currentmin = 0;

        for (int i = 0; i < nums.length; i++) {
            totalsum = totalsum + nums[i];

            currentmax = currentmax + nums[i];
            maxsum = Math.max(maxsum, currentmax);

            if (currentmax < 0) {
                currentmax = 0;
            }

            currentmin = currentmin + nums[i];
            minsum = Math.min(minsum, currentmin);

            if (currentmin > 0) {
                currentmin = 0;
            }
        }

        if (maxsum < 0) {
            return (int) maxsum;
        }

        long circularsum = totalsum - minsum;

        return (int) Math.max(maxsum, circularsum);
    }
}