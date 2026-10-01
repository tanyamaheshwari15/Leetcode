class Solution {
    public int trap(int[] height) {

        int maxLeft = 0;
        int maxRight = height[height.length - 1];

        int water = 0;

        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            maxLeft = Math.max(maxLeft, height[start]);
            maxRight = Math.max(maxRight, height[end]);

            if (maxLeft < maxRight) {
                water += maxLeft - height[start];
                start++;
            } else {
                water += maxRight - height[end];
                end--;
            }
        }

        return water;
    }
}