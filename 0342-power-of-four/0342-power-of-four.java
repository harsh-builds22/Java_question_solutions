class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        if ((n & (n - 1)) == 0) {
            int odd = countEven(n);
            if (odd % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int countEven(int n) {
        int counts = 1;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            if (last == 0) {
                counts++;
            }
        }
        return counts;
    }
}