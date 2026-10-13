class Solution {
    int[] count;

    public void merge(int[] arr, int[] indices, int low, int mid, int high) {
        List<Integer> tempIndices = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int rightCount = 0;

        while (left <= mid && right <= high) {
            if (arr[indices[right]] < arr[indices[left]]) {
                rightCount++;
                tempIndices.add(indices[right]);
                right++;
            } else {
                count[indices[left]] += rightCount;
                tempIndices.add(indices[left]);
                left++;
            }
        }
        while (left <= mid) {
            count[indices[left]] += rightCount;
            tempIndices.add(indices[left]);
            left++;
        }

        while (right <= high) {
            tempIndices.add(indices[right]);
            right++;
        }
        
        for (int i = low; i <= high; i++) {
            indices[i] = tempIndices.get(i - low);
        }
    }

    public void mergeSortHelper(int[] arr, int[] indices, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        mergeSortHelper(arr, indices, low, mid);
        mergeSortHelper(arr, indices, mid + 1, high);
        merge(arr, indices, low, mid, high);
    }

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        int[] indices = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        mergeSortHelper(nums, indices, 0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int c : count) {
            result.add(c);
        }
        return result;
    }
}