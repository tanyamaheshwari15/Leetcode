class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;

        // Naive approach

        // for(int i=0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j < nums.length; j++){
        //         sum = sum + nums[j];
        //         if(sum == k) c++;
        //     }
        // }

        // Using HashMap

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        map.put(0,1); // if sum-k = 0 and i don't add this then the subarray will not count
        
        for(int e: nums){
            sum = sum + e;
            c += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return c;
    }
}