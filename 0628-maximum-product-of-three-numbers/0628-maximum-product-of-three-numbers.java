class Solution {
   public int maximumProduct(int[] arr) {
    Arrays.sort(arr);

    int Product1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
    int Product2 = arr[0] * arr[1] * arr[arr.length - 1];

    int ans = Math.max(Product1, Product2);
    return ans;
}
}