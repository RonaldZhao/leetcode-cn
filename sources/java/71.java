import java.util.Stack;

public class Solution {
    // 71. 简化路径
    public String simplifyPath(String path) {
        String[] strings = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (String string : strings) {
            if (!string.equals(".") && !string.equals("")) { // 如果是"."或者空字符则跳过
                if (string.equals("..")) {
                    if (!stack.empty()) {
                        stack.pop(); // 移除上级目录
                    }
                } else {
                    stack.push(string);
                }
            }
        }
        String ret = "";
        while (!stack.empty()) {
            ret += "/" + stack.remove(0);
        }
        return ret.equals("") ? "/" : ret;
    }

}
