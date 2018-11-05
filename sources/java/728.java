class Solution {
    private boolean isIt(int x) {
        int t = x;
        while (t != 0) {
            int k = t % 10;
            if (k == 0 || x % k != 0) {
                return false;
            }
            t /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isIt(i)) {
                list.add(i);
            }
        }
        return list;
    }
}