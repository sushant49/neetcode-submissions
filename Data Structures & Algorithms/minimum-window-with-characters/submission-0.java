class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> formed = new HashMap<>();
        for(char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        int form=0, required = target.size(), start=0, left=0, minLen = Integer.MAX_VALUE;
        for(int right=0; right < s.length(); right++) {
            char c = s.charAt(right);
            formed.put(c, formed.getOrDefault(c,0)+1);
            if(target.containsKey(c) && target.get(c).intValue() == formed.get(c).intValue()) {
                form++;
            }
            while (form == required) {
                if(right-left+1 < minLen) {
                    minLen = right-left+1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                formed.put(leftChar, formed.get(leftChar)-1);
                if(target.containsKey(leftChar) && formed.get(leftChar) < target.get(leftChar)) {
                    form--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
           
    }
}
