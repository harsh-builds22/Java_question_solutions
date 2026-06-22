class Solution {
    static int[] searchRange(int[] arr, int target) {
        int first = let2(arr, target);
        int last = let1(arr, target);

        return new int[] { first, last };
    }

    static int let1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int let2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {

                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }
}