public class Solution {
    
    // 151. 翻转字符串里的单词
    public String reverseWords(String s) {
        s.trim(); // 去掉前后的空格
        StringBuilder sb = new StringBuilder();
        for (String string : s.split(" ")) {
            if (!string.equals("")) {
                sb.insert(0, " " + string);
            }
        }
        return sb.length() > 0 ? sb.toString().trim() : "";
    }
    
}
