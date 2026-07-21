class Solution {
    public void moveZeroes(int[] arr) {

        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                j++;
            }

        }
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}