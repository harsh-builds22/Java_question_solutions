class Solution {
    public int maximumWealth(int[][] accounts) {
        int richh = 0;
        for (int[] i : accounts) {
            int sum = 0;
            for (int money : i) {
                sum += money;
            }
            richh = Math.max(richh, sum);
        }
        return richh;
    }

}