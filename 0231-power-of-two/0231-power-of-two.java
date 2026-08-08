class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            if (last == 1) {
                count++;
            }

        }

        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}