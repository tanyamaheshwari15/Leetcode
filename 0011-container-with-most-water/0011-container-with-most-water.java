class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (i < j) {
            int minheight = Math.min(height[i], height[j]); 
            if (max < minheight * (j - i)) 
                max = minheight * (j - i);
            if(height[i] > height[j]) j--;
            else i++;
        }

        return max;
    }
}