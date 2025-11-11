class Solution {
    public boolean primeSubOperation(int[] nums) {
        int prev = 0;        
        for (int n : nums) {
            int upperBound = n - prev;
            int largestPrime = 0;
            for (int i = upperBound - 1; i >= 2; i--) {
                if (isPrime(i)) {
                    largestPrime = i;
                    break;
                }
            }
            if ((n - largestPrime) <= prev) {
                return false;
            }
            prev = n - largestPrime;
        }
        return true;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}