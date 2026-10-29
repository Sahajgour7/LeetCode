class Solution {
    public int removeDuplicates(int[] num) {
        int i = 0;
        int j = 1;

        while (j < num.length) {
            if (num[j] != num[i]) {
                i++;
                num[i] = num[j];
            }
            j++;
        }
        return i + 1;
    }
}