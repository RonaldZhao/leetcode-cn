class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i;
        for(i = 0; i < A.length - 1; i++) {
            if(A[i] > A[i+1]) {
                break;
            }
        }
        return i;
    }
}