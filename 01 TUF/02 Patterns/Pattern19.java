class Solution {
    public void pattern19(int n) {

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}