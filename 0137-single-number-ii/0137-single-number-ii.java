class Solution {

    public int singleNumber(int[] nums) {

        int result = 0;
        for (int k = 0; k <= 31; k++) {
            int oneCount = 0;
            int zeroCount = 0;
            int temp = 1 << k;
            // ye loop sare element ke kth bit dek lega.   
            for (int num : nums) {
                // abb pata karna he ki kisi bhi bit ka Kth bit ka kya he
                if ((num & (temp)) == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
            if (oneCount % 3 == 1) {
                result = (result | (temp));
            }
        }

        return result;

    }

}