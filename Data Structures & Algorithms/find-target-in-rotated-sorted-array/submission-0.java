class Solution {
    public int search(int[] nums, int target) {
        int pivotElement = pivot(nums);
        int leftElement = binarySearch(nums,0,pivotElement,target);
        if(leftElement != -1) return leftElement;
        else {
            int rightElement = binarySearch(nums,pivotElement+1,nums.length-1, target);
            return rightElement;
        }
    }

    public int binarySearch(int[] nums, int l, int r, int target) {
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return -1;
    }

    public int pivot(int[] nums) {
        int l=0, r= nums.length-1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(r> mid && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(l<mid && nums[mid-1] > nums[mid]) {
                return mid-1;
            }
            if(nums[l] <= nums[mid]) {
                l=mid+1;
            }  else {
                r=mid-1;
            }
        }
        return -1;
    }
}
