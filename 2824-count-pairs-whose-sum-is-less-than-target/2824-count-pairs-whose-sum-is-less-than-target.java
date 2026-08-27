
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int i = 0;
        int j = nums.size() - 1;

        int counts = 0;
        while (i < j) {
            int sum = nums.get(i) + nums.get(j);
            if (sum < target) {
                counts = counts + (j - i);
                i++;

            } else {
                j--;
            }
        }
        return counts;
    }
}