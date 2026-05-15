class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> myset = new HashSet<>();
        if(nums.length == 0) return 0;
        for(int num : nums) {
            myset.add(num);
        }
        int maxSeq=0;
        for(int num: nums) {
            if(!myset.contains(num-1)) {
                int currNum = num;
                int currSeq = 1;
                while(myset.contains(currNum + 1)) {
                    currNum += 1;
                    currSeq += 1;
                }
                maxSeq = Math.max(maxSeq, currSeq);
            }
        }
        return maxSeq;
    }
}
