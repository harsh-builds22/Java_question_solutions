class Solution {
    public int pivotIndex(int[] arr) {
        int sum = 0;

        //  sum of array
        for (int k = 0; k < arr.length; k++) {
            sum = arr[k] + sum;
        }

        int right = 0;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            right = sum - left - arr[i];

            if (left == right) {

                return i;

            }
            left = arr[i] + left;
        }

        return -1;

    }

}