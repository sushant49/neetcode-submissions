class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i=0; i< temperatures.length; i++) {
            int count = 0;
            for(int j=i+1; j< temperatures.length; j++) {
                if(temperatures[j] <= temperatures[i]) {
                    count++;
                } else {
                    count++;
                    result[i] = count;
                    break;
                }
            }
        }
        return result;
    }
}
