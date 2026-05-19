class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        int l = str.length()-1;
        if(l == -1) return true;
        while(i < str.length() && l>=0 && Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(l))){
            if(i==str.length()-1 && l ==0) return true;
            i++;
            l--;
        }
        return false;
    }
}
