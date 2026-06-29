class Solution {
        public double findMaxAverage(int[] arr, int window) {
    // Edge case: if the array is empty or smaller than the window
    if (arr == null || arr.length < window) {
        return 0.0;
    }

    int i = 0;
    int j = 0;
    int sum = 0;
    
    // Use Double.NEGATIVE_INFINITY or a very small integer since averages can be negative
    double maxAvg = Long.MIN_VALUE; 

    while (j < arr.length) {
        sum = sum + arr[j]; // Keep the sum pure (don't divide yet!)

        if (j - i + 1 < window) {
            j++;
        } 
        else if (j - i + 1 == window) {
            // Calculate the current average by casting sum to double
            double currentAvg = (double) sum / window;
            
            maxAvg = Math.max(maxAvg, currentAvg);
            
            // Slide the window
            sum = sum - arr[i];
            i++;
            j++;
        }
    }

    return maxAvg;
}
    
}