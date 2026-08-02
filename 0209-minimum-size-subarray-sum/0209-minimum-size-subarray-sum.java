class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int min = Integer.MAX_VALUE;
          int check = min;
             int i = 0;
             int j = 0;
             int sum = 0;
             while(j<nums.length){

                   sum = sum + nums[j];


                   while (sum>=target){
                       min = Math.min(min , j-i+1);
                       sum = sum - nums[i];
                       i++;
                   }
              j++;
             }
             if(min == check){
                 return 0;
             }else {
             return  min;
             }
    }





}