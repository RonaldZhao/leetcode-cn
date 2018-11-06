class Solution {
    public int addDigits(int num) {
        // 先写个递归的解法然后输出一些例子就看出来了
        if (num < 10) {
            return num;
        }
        int[] arr = {9, 1, 2, 3, 4, 5, 6, 7, 8};
        return arr[num % 9];
    }
}