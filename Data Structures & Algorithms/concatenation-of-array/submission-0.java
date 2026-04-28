class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2* size];
        for(int i=0; i< size; i++) {
            ans[i] = nums[i];
        }
        for(int i=0; i< size; i++) {
            ans[i+size] = nums[i];
        }
        return ans;
    }
}