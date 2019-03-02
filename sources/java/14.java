public class Solution {
    /*
     * 14. 最长公共前缀
     */

    // 解法1：水平扫描法
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0]; // 假设结果为第一个字符串
        for (int i = 1; i < strs.length; i++) { // 根据后面的字符串逐渐删减结果字符串
            while (strs[i].indexOf(prefix) != 0) { // 如果当前结果不是当前字符串的前缀
                prefix = prefix.substring(0, prefix.length() - 1); // 则每次将结果字符串的最后一个字符删去
                if (prefix == "") { // 如果删减到结果为空串则直接返回
                    return "";
                }
            }
        }
        return prefix;
    }

    // 解法2：竖直扫描法
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {// 将第一个字符串的每一个字符依次和后面每一个字符串相同位置的字符进行比较
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {// 如果当前位置已经是比较字符串的长度，或者字符不相同
                    return strs[0].substring(0, i);// 则将第一个字符串截断到当前位置的前一个
                }
            }
        }
        return strs[0];
    }
    
    // 更多解法：https://leetcode-cn.com/problems/longest-common-prefix/solution/
}
