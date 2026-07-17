import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            arr[k] = arr[k] * arr[k];
        }

        Arrays.sort(arr);

        return arr;
    }

}