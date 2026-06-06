class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        for(int left=0; left< nums.length-k+1; left++) {
            int max=nums[left];
            for(int right=left; right< left+k ; right++) {
                max= Math.max(max, nums[right]);
            }
            ans[left] = max;
        }
        return ans;
    }
}
