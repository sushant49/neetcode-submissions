class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        int count=0;
        prefix[0] = height[0];
        for(int i=1; i< height.length ; i++) {
            prefix[i] = Math.max(prefix[i-1], height[i]);
        }
        suffix[height.length-1] = height[height.length-1];
        for(int j= height.length-2; j>=0; j--) {
            suffix[j] = Math.max(suffix[j+1], height[j]);
        }
        for(int a=0; a< height.length; a++) {
            int leftMax = prefix[a];
            int rightMax= suffix[a];
            count+= Math.min(leftMax,rightMax) - height[a];
        }
        return count;
    }
}
