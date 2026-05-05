class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mymap = new HashMap<>();
        int[] ans = new int[k];
        for (int i = 0; i < nums.length; i++) {
            mymap.put(nums[i], mymap.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] mylist = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
            int freq = entry.getValue();
            if (mylist[freq] == null) {
                mylist[freq] = new ArrayList<>();
            }
            mylist[freq].add(entry.getKey());
        }
        int index = 0;
        for (int j = mylist.length-1; j >= 0 && index < k; j--) {
            if (mylist[j] != null) {
                for (int num : mylist[j]) {
                    ans[index++] = num;
                    if (index == k) return ans;
                }
            }
        }
        return ans;
    }
}
