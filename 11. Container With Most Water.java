class Solution {
    public int maxArea(int[] height) 
    {
        int n=height.length;
        int left=0;
        int right=n-1;
        int res=0;
        while(left<right)
        {
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            res=Math.max(res,h*width);
            if(height[left]>height[right])
            {
                right--;
            }
            else
                left++;
        }
        return res;
    }
}