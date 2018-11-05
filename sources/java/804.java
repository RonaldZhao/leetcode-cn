class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> hs = new HashSet<>();
        for (String word : words) {
            char[] carr = word.toCharArray();
            String s = "";
            for (char c : carr) {
                s += str[c - 97];
            }
            hs.add(s);
        }
        return hs.size();
    }
}