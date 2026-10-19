class Solution {
    public int[] searchRange(int[] arr, int target) {
        int first = firstoccurence(arr, target);
        int last = lastoccurence(arr, target);

        return new int[] { first, last };
    }

    public int firstoccurence(int[] arr, int target) {

        int high = arr.length - 1;
        int low = 0;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                ans = mid;
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int lastoccurence(int[] arr, int target) {

        int high = arr.length - 1;
        int low = 0;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                ans = mid;
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

}