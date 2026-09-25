class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i: nums){
            if(minheap.size() != k)
                minheap.add(i);
            else{
                if(i > minheap.peek()){
                    minheap.remove();
                    minheap.add(i);
                }
            }
        }

        return minheap.peek();
    }
}