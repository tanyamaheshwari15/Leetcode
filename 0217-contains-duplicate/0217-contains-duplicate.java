class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for(int e: nums){
        //     if(set.contains(e)) return true;
        //     set.add(e);
        // }

        // return false;

        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] == nums[i]) return true;
        }
        return false;
    }
}