class Solution {
    public int rob(int[] nums) {
        if (nums.length <= 1) {
            return nums.length == 0 ? 0 : nums[0];
        }
        int pre = nums[0]; // 上一次的最大值
        int cur = Math.max(nums[0], nums[1]); // 当前的最大值
        for (int i = 2; i < nums.length; i++) {
            int t = cur;
            cur = Math.max(pre + nums[i], cur);
            pre = t;
        }
        return cur;
    }
}