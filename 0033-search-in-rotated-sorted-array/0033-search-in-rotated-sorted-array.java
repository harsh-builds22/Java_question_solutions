class Solution {
    public int search(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[low] <= arr[mid]) {
            // left half sorted hai
            if (arr[low] <= target && target < arr[mid]) {
                high = mid - 1;   // target left sorted hisse mein hai
            } else {
                low = mid + 1;
            }
        } else {
            // right half sorted hai
            if (arr[mid] < target && target <= arr[high]) {
                low = mid + 1;    // target right sorted hisse mein hai
            } else {
                high = mid - 1;
            }
        }
    }

    return -1;
}

}