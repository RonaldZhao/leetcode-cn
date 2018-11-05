class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int i, j, col = A[0].length, t;
        for (int row = 0; row < A.length; row++) {
            i = 0;
            j = col - 1;
            while (i <= j) {
                if (A[row][i] == A[row][j]) {
                    A[row][i] = A[row][j] = (A[row][i] == 0 ? 1 : 0);
                }
                i++;
                j--;
            }
        }
        return A;
    }
}