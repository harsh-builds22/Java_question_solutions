class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Shuru me hume 1 plus karna hai, isliye carry = 1
        
        // Right se Left ki taraf loop chalayenge
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry; // Current digit aur carry ko jodo
            
            digits[i] = sum % 10;        // Agar sum 10 hua to ye 0 banayega, nahi to vahi number rahega
            carry = sum / 10;            // Agar sum 10 hua to carry 1 banega, nahi to 0
            
            // Agar kisi point par carry 0 ho gaya, to aage loop chalane ki zaroorat hi nahi!
            if (carry == 0) {
                return digits;
            }
        }
        
        // EDGE CASE: Agar loop khatam hone ke baad bhi carry 1 bacha hai (jaise 999 + 1 me)
        if (carry == 1) {
            int[] ans = new int[n + 1];
            ans[0] = 1; // Sabse aage 1 rakh do
            // Baaki saare elements naye array me by default 0 hi hote hain
            return ans;
        }
        
        return digits;
    }
}