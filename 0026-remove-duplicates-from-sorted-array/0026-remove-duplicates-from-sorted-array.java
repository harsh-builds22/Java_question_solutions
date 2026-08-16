class Solution {

public int removeDuplicates(int[] arr) {
    if (arr.length == 0) return 0;

    int m = 1;  // index 0 already sahi jagah hai, agla unique yaha se store hoga
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[i - 1]) {
            arr[m] = arr[i];
            m++;
        }
    }
    return m;   // k hi represent karta hai kitne unique elements store hue
}
     


}