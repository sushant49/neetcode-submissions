class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0; i< strs.length; i++) {
            if (visited[i]) continue;
            List<String> newlist = new ArrayList<>();
            newlist.add(strs[i]);
            visited[i] = true;
            for(int j=i+1; j< strs.length; j++) {
                if(!visited[j] && isAnagram(strs[i],strs[j])) {
                    newlist.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(newlist);
        }
        return ans;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(int i=0; i< s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int fr : freq) {
            if(fr != 0) return false;
        }
        return true;
    }
}
