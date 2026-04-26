class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        String a = new String(sChar);
        String b = new String(tChar);
        System.out.println(a + " " + b);
        return a.equals(b);
    }
}
