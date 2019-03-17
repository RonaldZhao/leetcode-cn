class Solution {

    private int[] origin;
    private int[] randomArray;

    public Solution(int[] nums) {
        this.origin = nums;
        this.randomArray = Arrays.copyOf(origin, origin.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.randomArray = Arrays.copyOf(origin, origin.length);
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        int size = this.origin.length;
        while (size > 0) {
            int k = random.nextInt(size);
            swap(this.randomArray, --size, k);
        }
        return this.randomArray;
    }

    private void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}