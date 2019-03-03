class Solution {
    public int singleNumber(int[] nums) {
        // 根据异或运算：两个相同的数字作异或运算的结果为0，一个数和0作异或等于它本身
        // 所以将给定数组中的所有数进行异或运算的结果即为所求
        int ret = 0;
        for(int x : nums) {
            ret ^= x;
        }
        return ret;
    }
}