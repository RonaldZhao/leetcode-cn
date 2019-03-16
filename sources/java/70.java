public class Solution {
    public int climbStairs(int n) {
        int[] ways = { 1, 1 }; // ways[0] : n - 2 ; ways[1] : n - 1
        for (int i = 1; i < n; i++) {
            int t = ways[1];
            ways[1] += ways[0];
            ways[0] = t;
        }
        return ways[1];
    }

    public int climbStairs1(int n) { // 超时
        if (n <= 1)
            return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}