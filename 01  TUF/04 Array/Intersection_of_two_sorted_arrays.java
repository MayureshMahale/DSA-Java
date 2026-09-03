class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
       List<Integer> tempList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } 
            else {
                tempList.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[tempList.size()];
        for (int k = 0; k < tempList.size(); k++) {
            ans[k] = tempList.get(k);
        }

        return ans;
    }
}
