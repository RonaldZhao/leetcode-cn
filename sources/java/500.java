class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> line1 = new HashSet<>();
        HashSet<Character> line2 = new HashSet<>();
        HashSet<Character> line3 = new HashSet<>();
        HashSet<Character> ths = new HashSet<>();
        char[] ca1 = "qwertyuiop".toCharArray();
        for (char c : ca1) {
            line1.add(c);
        }
        char[] ca2 = "asdfghjkl".toCharArray();
        for (char c : ca2) {
            line2.add(c);
        }
        char[] ca3 = "zxcvbnm".toCharArray();
        for (char c : ca3) {
            line3.add(c);
        }
        List<String> ret = new ArrayList<>();
        for (String w : words) {
            char[] ca = w.toLowerCase().toCharArray();
            for (char c : ca) {
                ths.add(c);
            }
            if (line1.containsAll(ths) || line2.containsAll(ths) || line3.containsAll(ths)) {
                ret.add(w);
            }
            ths.clear();
        }
        return ret.toArray(new String[ret.size()]);
    }
}