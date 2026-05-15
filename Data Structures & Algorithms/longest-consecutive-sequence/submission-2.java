class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int currSeq=1, maxSeq=1;
        if(nums.length == 0) {
            return 0;
        }
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]+1) {
                currSeq++;
            } else if(nums[i] == nums[i-1]) {
                continue;
            }
            else {
                currSeq = 1;
            }
           maxSeq = Math.max(maxSeq, currSeq);
        }
        return maxSeq;
    }
}
