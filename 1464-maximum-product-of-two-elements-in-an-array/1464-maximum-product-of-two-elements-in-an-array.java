class Solution {
    
      public int maxProduct(int[] arr) {
          Arrays.sort(arr);

          int firstMax = arr[arr.length-1] - 1;
          int secondMax = arr[arr.length - 2] - 1;

          int ans = firstMax*secondMax;

          return ans ;

    }



}