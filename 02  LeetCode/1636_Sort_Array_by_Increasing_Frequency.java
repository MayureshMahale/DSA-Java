class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        Integer[] ans = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        Arrays.sort(ans, (a, b) -> {
            if (!mpp.get(a).equals(mpp.get(b))) {
                return mpp.get(a) - mpp.get(b);
            }
            return b - a;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }

        return nums;
    }
}