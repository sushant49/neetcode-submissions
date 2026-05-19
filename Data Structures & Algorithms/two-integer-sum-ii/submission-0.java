class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(numbers[l] + numbers[r] != target) {
            int sum = numbers[l] + numbers[r];
            if(sum > target) r--;
            else if(sum < target) l++;
        }
        return new int[]{l+1,r+1};
    }
}
