class Solution {
    public boolean isValid(String s) {
        int l = 0, r = s.length() - 1;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') st.push(')');
            else if(c == '{') st.push('}');
            else if(c == '[') st.push(']');
            else if(st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
}
