class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        for(Map.Entry<Integer, Integer> max : map.entrySet()){
            if(max.getValue() > nums.length/3)
                ans.add(max.getKey());
        }

        return ans;
    }
}