class Solution {
    public int minBitFlips(int start, int goal) {

        int count = 0;
        while (start > 0 || goal > 0) {
            int last1 = start & 1;
            int last2 = goal & 1;
            if (last1 != last2) {
                count++;
            }
            start = start >> 1;
            goal = goal >> 1;
        }

        return count;

    }
}