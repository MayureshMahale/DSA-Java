import java.util.Arrays;

class Solution {
    public int[] divisors(int n) {
        int[] temp = new int[n];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                temp[count++] = i;
            }
        }

        return Arrays.copyOf(temp, count);
    }
}
