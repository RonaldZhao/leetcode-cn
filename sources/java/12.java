class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] carr = s.toCharArray();

        int k = map.get(carr[carr.length - 1]);

        for (int i = carr.length - 2; i >= 0; i--) {
            int t = map.get(carr[i]);
            if (t < map.get(carr[i + 1])) {
                k -= t;
            } else {
                k += t;
            }
        }
        return k;
    }
}