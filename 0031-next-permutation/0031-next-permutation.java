class Solution {

    public static void reverseFromIndex(int[] arr, int startIndex) {
        int left = startIndex;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int size = nums.length-1;
        int min = Integer.MAX_VALUE;
        int index = -1;
        int pivot = 0;

        for(int i = size-1; i >= 0; i--){
            
            if(nums[i] < nums[i+1]){

                for(int j = i+1; j <= size; j++){
                    if(nums[j] <= min && nums[j] > nums[i]){ 
                        min = nums[j];
                        index = j;
                    }  
                }

                if(nums[i] < min){
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    reverseFromIndex(nums, i+1);
                    pivot = 1;
                }

                break;
            }
        }
        if(pivot == 0) reverseFromIndex(nums, 0);
    }
}