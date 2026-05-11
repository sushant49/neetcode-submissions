class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            ans[i] = product(i,nums);
        }        
        return ans;
    }
    public int product(int i, int[] nums) {
        int prod=1;
        for(int j=0; j< nums.length; j++) {
            if(j!=i) {
                prod *= nums[j];
            }
        }
        return prod;
    }
}  
