class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length, t;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 != 0) {
                j += 2;
            }
            if(i >= n || j >= n){
                break;
            }
            t = A[i];
            A[i] = A[j];
            i += 2;
            A[j] = t;
            j += 2;
        }
        return A;
    }
}