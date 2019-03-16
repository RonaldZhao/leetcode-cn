class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int sum = 0;
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (sum < 0)
                sum = 0;
            sum += nums[i];
            ret = Math.max(sum, ret);
        }
        return ret;
    }
}