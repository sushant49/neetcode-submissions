class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for(int a = j+1; a< nums.length; a++) {
                    int sum = nums[i] + nums[j] + nums[a];
                    if(sum == 0) {
                        List<Integer> ans = Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[a]
                        );
                        Collections.sort(ans);
                        set.add(ans);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
