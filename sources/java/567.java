public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[] arr = new int[26]; // 存放s1中出现的所有字符出现的次数
        int[] window = new int[26]; // 存放窗口中各个字符出现的次数
        for (int i = 0; i < len1; i++) { // 统计s1中各字符出现的次数
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len2; i++) {
            if (i >= len1) {
                --window[s2.charAt(i - len1) - 'a']; // 将窗口的第一个字符出现的次数减一，即移除窗口中的第一个字符
            }
            window[s2.charAt(i) - 'a']++; // 将新字符加入窗口
            if (Arrays.equals(arr, window)) {
                return true;
            }
        }
        return false;
    }
}
