class Solution {
    // 虽然通过了,但是如果要求对任意长度的字符串都能正确处理就要考虑使用大整数.
    public int titleToNumber(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('A' + i), i + 1);
        }
        char[] carr = s.toCharArray();
        if (carr.length == 1) {
            return map.get(carr[0]);
        }
        int ret = 0;
        for (int x = 1; x <= carr.length; x++) {
            ret += (Math.pow(26, carr.length - x)) * map.get(carr[x - 1]);
        }
        return ret;
    }
}