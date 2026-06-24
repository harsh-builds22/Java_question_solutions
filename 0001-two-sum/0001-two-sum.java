class Solution {
    public int[] twoSum(int[] nums, int target) {
           for(int i = 0; i < nums.length-1; i++) {
            int num1 = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                 int num2 = nums[j];
             if(num1 + num2 == target){
                 return new int[]{ i,j};
               }
            }
        }

        return new int[]{-1,-1};
    }
    }


    
