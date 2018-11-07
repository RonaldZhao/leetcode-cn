class Solution {
    public int smallestRangeI(int[] A, int K) {
        if (A.length <= 1) {
            return 0;
        }
        Arrays.sort(A);
        int min = A[0], max = A[A.length - 1];
        return max - min <= 2 * K ? 0 : max - min - 2 * K;
    }
}