class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int[] ans = new int[l1 + l2];
        int i = 0, j = 0, index = 0;
        while (i < l1 && j < l2) {
            if (nums1[i] > nums2[j]) {
                ans[index++] = nums2[j++];
            } else {
                ans[index++] = nums1[i++];
            }
        }
        while (i < l1) {
            ans[index++] = nums1[i++];
        }
        while (j < l2) {
            ans[index++] = nums2[j++];
        }
        int n = l1 + l2;
        if (n % 2 != 0)
            return ans[n / 2];
        else {
            int a = ans[n / 2];
            int b = ans[n / 2 - 1];
            return (a + b) / 2.0;
        }
    }
}
