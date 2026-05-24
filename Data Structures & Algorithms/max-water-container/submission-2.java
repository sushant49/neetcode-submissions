class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1,maxArea=0;
        while(i<j) {
            int area=0;
            int minHeight = Math.min(heights[i],heights[j]);
            area = (j-i) * minHeight;
            maxArea = Math.max(area, maxArea);
            if(heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
