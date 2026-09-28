class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p = 0, q = 0;
        int n = word1.length(), m = word2.length();
        StringBuilder sb = new StringBuilder();

        // Merge alternately
        while (p < n && q < m) {
            sb.append(word1.charAt(p++));
            sb.append(word2.charAt(q++));
        }

        // Add leftovers
        while (p < n) sb.append(word1.charAt(p++));
        while (q < m) sb.append(word2.charAt(q++));

        return sb.toString();
    }
}
