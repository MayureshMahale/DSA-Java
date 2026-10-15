class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        Set<Integer> seen = new HashSet<>();
        for (int freq : mpp.values()) {

            if (seen.contains(freq)) {
                return false;
            }
            seen.add(freq);
        }

        return true;
    }
}