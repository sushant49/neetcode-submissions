class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1, r=0;
        for(int pile: piles) {
            r = Math.max(r, pile);
        }
        int ans = r;
        while(l<=r) {
            int mid= l + (r-l)/2;
            if(canDo(piles,mid,h)) {
                ans = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return ans;
    }

    public boolean canDo(int[] piles, int mid, int h) {
        long hours=0;
        for(int pile: piles) {
            hours += (pile+mid-1)/mid;
        }
        return hours<=h;
    }
}
