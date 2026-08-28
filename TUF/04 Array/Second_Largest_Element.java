class Solution {
    public int secondLargestElement(int[] nums) {
        int max = nums[0];
        int secmax = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                secmax = max;
                max = nums[i];

            } else if (nums[i] > secmax && nums[i] != max) {
                secmax = nums[i];
            }
        }

        if (secmax == Integer.MIN_VALUE) {
            return -1;
        }

        return secmax;
    }
}