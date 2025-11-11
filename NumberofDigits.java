class Solution {
    public int countDigitOne(int n) {
        if (n < 1) return 0;

        int count = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 1) {
                    count++;
                }
                temp = temp / 10;
            }
        }

        return count;
    }
}
