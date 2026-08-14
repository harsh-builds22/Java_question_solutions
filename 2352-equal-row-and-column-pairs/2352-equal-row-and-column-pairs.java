class Solution {
    public int equalPairs(int[][] grid) {

        int count = 0;
        //  ye loop sari rows tak jayega
        for (int i = 0; i < grid.length; i++) {
            // isme individual rows ke elements save honge.
            List<Integer> rowList = new ArrayList<>();
            // isse sare rows ke elements save honge bcz n*n ka matrix he isliye grid.length aya
            for (int j = 0; j < grid.length; j++) {
                rowList.add(grid[i][j]);
            }

            // abb ek loop jisse columns check karnge add karte karte
            for (int c = 0; c < grid.length; c++) {
                List<Integer> collist = new ArrayList<>();
                for (int k = 0; k < grid.length; k++) {
                    collist.add(grid[k][c]);
                }
                if (rowList.equals(collist)) {
                    count++;
                }
            }
        }
        return count;
    }

}