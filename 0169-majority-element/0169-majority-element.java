class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        for(Map.Entry<Integer, Integer> max : map.entrySet()){
            if(max.getValue() > nums.length/2)
                return max.getKey();
        }

        return 0;
    }
}