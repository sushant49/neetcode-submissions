class Solution {
    public int findMin(int[] nums) {
        int pivotElement = pivot(nums);
        if(pivotElement == -1) {
            return nums[0];
        } else {
            return nums[pivotElement+1];
        }
    }
    public int pivot(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if(r>mid && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(l<mid && nums[mid-1] > nums[mid]) {
                return mid-1;
            }
            if(nums[l] <= nums[mid]) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return -1;
    }
}
