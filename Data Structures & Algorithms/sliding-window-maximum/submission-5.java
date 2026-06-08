class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        int[] ans = new int[nums.length-k+1];
        int idx=0;
        for(int right=0; right<  nums.length; right++) {
            maxHeap.offer(new int[]{nums[right], right});
            while(maxHeap.peek()[1] <= right-k) {
                maxHeap.poll();
            }
            if(right >= k-1) {
                ans[idx++] = maxHeap.peek()[0];
            }
        }
        return ans;
    }
}
