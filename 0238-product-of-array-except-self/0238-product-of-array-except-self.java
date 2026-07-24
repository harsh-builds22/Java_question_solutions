class Solution {

    public int[] productExceptSelf(int[] arr) {

        int[] leftProductArray = leftProduct(arr);
        int[] rightProductArray = rightProduct(arr);

        int[] finalResult = new int[arr.length];

        int min = Math.min(leftProductArray.length, rightProductArray.length);

        for (int i = 0; i < min; i++) {
            finalResult[i] = leftProductArray[i] * rightProductArray[i];
        }

        return finalResult;
    }

    //  left part ka array nikal diya 
    public int[] leftProduct(int[] arr) {

        int[] result = new int[arr.length];

        result[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }
        return result;

    }

    public int[] rightProduct(int[] arr) {

        int[] result = new int[arr.length];

        result[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            result[i] = result[i + 1] * arr[i + 1];
        }
        return result;

    }
}