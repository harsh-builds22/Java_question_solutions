class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            List<Integer> rowlist = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                rowlist.add(grid[i][j]);
            }

            for (int c = 0; c < grid.length; c++) {
                List<Integer> collist = new ArrayList<>();
                for (int k = 0; k < grid.length; k++) {
                    collist.add(grid[k][c]);
                }

                if (rowlist.equals(collist)) {
                    count++;

                }

            }

        }
        return count;
    }

}