class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            boolean isRightEven = (high - mid) % 2 == 0;
            if (arr[mid] == arr[mid - 1]) {
                if (isRightEven) {
                    high = mid - 2;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] == arr[mid + 1]) {
                if (isRightEven) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            }
        }
        return arr[low];
    }
}