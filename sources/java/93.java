public class solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        int slen = s.length();
        if (slen >= 4 && slen <= 12) {
        }
        List<String> list = new ArrayList<String>();
        helper(result, list, s, 0);
        return result;
    }

    private void helper(List<String> result, List<String> list, String s, int start) {
        if (list.size() == 4) {
            if (start != s.length()) {
                return;
            }
            StringBuffer sb = new StringBuffer();
            for (String str : list) {
                sb.append(str + ".");
            }
            sb.deleteCharAt(sb.length() - 1);
            result.add(sb.toString());
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) {
            String tmp = s.substring(start, i + 1);
            if (isvalid(tmp)) {
                list.add(tmp);
                helper(result, list, s, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isvalid(String s) {
        if (s.charAt(0) == '0') {
            return s.equals("0");
        }
        int n = Integer.valueOf(s);
        return n >= 0 && n <= 255;
    }

}

// 另一种写法

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        helper(result, s, "", 0, 0);
        return result;
    }

    private void helper(List<String> result, String s, String ip, int start, int count) {
        if (count > 4) {
            return;
        }
        if (count == 4 && start == s.length()) {
            result.add(ip);
            return;
        }

        for (int i = 1; i < 4; i++) {
            if (start + i > s.length()) {
                break;
            }
            String tmp = s.substring(start, start + i);
            if ((tmp.startsWith("0") && tmp.length() > 1) || (i == 3 && Integer.valueOf(tmp) > 255)) {
                continue;
            }
            helper(result, s, ip + tmp + (count == 3 ? "" : "."), start + i, count + 1);
        }
    }

}
