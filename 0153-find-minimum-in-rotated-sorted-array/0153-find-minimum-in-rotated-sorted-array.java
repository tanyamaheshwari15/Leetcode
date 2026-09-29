class Solution {
    public int findMin(int[] nums) {
        int mid = nums.length/2;
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            mid = left + (right - left)/2;

            if(nums[mid] > nums[right])
                left = mid+1;

            else
                right = mid;
        }

        return nums[left];
    }
}