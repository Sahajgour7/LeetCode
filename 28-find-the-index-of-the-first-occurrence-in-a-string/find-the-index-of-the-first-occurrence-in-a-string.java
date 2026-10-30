class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        while (i <= haystack.length() - needle.length()) {
            int j = 0;
            int index = 0;
            while (j < needle.length()) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    index++;
                }
                else {
                    break;
                }
                j++;
            }
            if (index == needle.length()) {
                return i;
            }
            i++;
        }
        return -1;
    }
}