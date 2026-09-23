class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        Map.Entry<Integer, Integer> max = Collections.max(map.entrySet(), Map.Entry.comparingByValue());

        return max.getKey();
    }
}