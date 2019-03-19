class Solution {
    public int countPrimes(int n) {
        // 解法：埃拉托斯特尼筛法
        int k = 0;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        for (int i = 2; i < Math.sqrt(n); i++) { // 因为内层循环的初始值为 i*i ，而 i*i 的极限值为 n，所以 i 的上限到 Math.sqrt(n) 就够了。
            if (arr[i]) {
                for (int j = i * i; j < n; j += i) { // j从 i*i 开始是因为：假设一个数 x(x > i) 是i的 k(k<i) 倍数，那么 x 也是 k 的倍数，而 k 的倍数的数在 i 之前已经被筛选掉了
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (arr[i])
                k++;
        }
        return k;
    }
}