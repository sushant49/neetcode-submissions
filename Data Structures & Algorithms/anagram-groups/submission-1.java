class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mymap = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (!mymap.containsKey(sortArray(strs[i]))) {
                List<String> mylist = new ArrayList<>();
                mylist.add(strs[i]);
                mymap.put(sortArray(strs[i]), mylist);
            } else {
                List<String> list = mymap.get(sortArray(strs[i]));
                list.add(strs[i]);
                mymap.put(sortArray(strs[i]), list);
            }
        }

        for(Map.Entry<String, List<String>> entry: mymap.entrySet()) {
            List<String> newList = entry.getValue();
            ans.add(newList);
        }
        return ans;
    }

    public String sortArray(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String ans = new String(str);
        return ans;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int fr : freq) {
            if (fr != 0)
                return false;
        }
        return true;
    }
}
