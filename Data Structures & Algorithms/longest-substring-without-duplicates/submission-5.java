class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> myset = new HashSet<>();
        int maxLen=0;
        int left=0;
        for(int right=0; right< s.length(); right++) {
            while(myset.contains(s.charAt(right))) {
                myset.remove(s.charAt(left));
                left++;
            }
            myset.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}