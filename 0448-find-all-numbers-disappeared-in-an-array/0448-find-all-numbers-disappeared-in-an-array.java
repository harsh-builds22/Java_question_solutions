class Solution {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int ind = nums[i] - 1;
            
            // Ek choti si safety check: ind valid range (0 se nums.length-1) me hona chahiye
            if (ind >= 0 && ind < nums.length && nums[i] != nums[ind]) {
                swap(nums, i, ind);
            } else {
                i++;
            }
        }

        // Missing numbers dhoondhne ka loop
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != (index + 1)) {
                list.add(index + 1);
            }
        }
        return list;
    }

    //swap method 
    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}