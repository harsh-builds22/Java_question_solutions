class Solution {

    public int maxProduct(int[] arr) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int nums : arr) {
            if (nums > firstMax) {
                secondMax = firstMax;
                firstMax = nums;
            } else if (nums > secondMax) {
                secondMax = nums;
            }
        }
        return (secondMax - 1) * (firstMax - 1);
    }

}