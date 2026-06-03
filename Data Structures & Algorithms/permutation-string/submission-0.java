class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        int left = 0;
        for(char c: s1.toCharArray()) {
            freq[c- 'a']++;
        }
        int[] windowFreq = new int[26];
        for(int right=0; right< s2.length(); right++) {
            windowFreq[s2.charAt(right) - 'a']++;
            if(right-left+1 > s1.length()) {
                 windowFreq[s2.charAt(left) - 'a']--;
                 left++;
            }
            if(right-left+1 == s1.length()) {
                if(Arrays.equals(freq,windowFreq)) {
                    return true;
                }
            }
        }
        return false;
    }
}
