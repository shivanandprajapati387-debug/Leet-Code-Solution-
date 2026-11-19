class Solution {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int count = 0;
        boolean odd = false;

        for (int i = 0; i < 128; i++) {
            count += (freq[i] / 2) * 2;

            if (freq[i] % 2 == 1) {
                odd = true;
            }
        }

        if (odd) {
            count++;
        }

        return count;
    }
}