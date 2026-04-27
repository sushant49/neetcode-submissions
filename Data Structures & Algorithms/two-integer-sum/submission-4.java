class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            int compliment = target - nums[i];
            if(mymap.containsKey(compliment)) {
                return new int[] {mymap.get(compliment) , i};
            } 
        
             mymap.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
