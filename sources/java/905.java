class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1, t;
        while (i < j) {
            if (A[i] % 2 == 0) {
                i++;
            } else if (A[j] % 2 != 0) {
                j--;
            } else {
                t = A[i];
                A[i] = A[j];
                A[j] = t;
            }
        }
        return A;
    }
}