class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] arr = new int[col][row];
        for (int r = 0; r < col; r++) {
            for (int c = 0; c < row; c++) {
                arr[r][c] = A[c][r];
            }
        }
        return arr;
    }
}