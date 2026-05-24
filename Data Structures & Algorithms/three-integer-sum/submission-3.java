class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i >= 1 && nums[i - 1] == nums[i]) {
                continue;
            }
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                    if(sum>0) {
                        right--;
                    } else if(sum<0) {
                        left++;
                    } else {
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left] == nums[left-1]) {
                            left++;
                        }
                    }
            }
        }
        return ans;
    }
}
