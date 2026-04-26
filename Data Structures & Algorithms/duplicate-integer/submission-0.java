class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> myset = new HashSet<>();
        for(int num : nums) {
            myset.add(num);
        }
        return myset.size() != nums.length;
    }
}