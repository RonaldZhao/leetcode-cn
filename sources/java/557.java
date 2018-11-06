class Solution {
    public String reverseWords(String s) {
        String[] sarr = s.split(" ");
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = new StringBuilder(sarr[i]).reverse().toString();
        }
        return String.join(" ", sarr);
    }
}