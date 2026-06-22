class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0; // Kyunki 0 se kisi bhi number ka XOR wahi number hota hai
        
        // Pure array par sirf ek single loop
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i]; // Saare duplicates ek doosre ko cancel out kar denge
        }
        
        return ans; // Aakhiri mein sirf single number bachega
    }
}