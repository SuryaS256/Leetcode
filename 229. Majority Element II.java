class Solution 
{
    public List<Integer> majorityElement(int[] nums)
    {
        List<Integer> res=new ArrayList<>();
        int c1=0,c2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(c1==0 && nums[i]!=ele2)
            {
                c1++;
                ele1=nums[i];
            }
            else if(c2==0 && nums[i]!=ele1)
            {
                c2++;
                ele2=nums[i];
            }
            else if(nums[i]==ele1)
            {
                c1++;
            }
            else if(nums[i]==ele2)
            {
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for (int i = 0;i<n;i++) 
        {
            if (nums[i]==ele1) c1++;
            if (nums[i]==ele2) c2++;
        }
        if(c1>(n/3))
            res.add(ele1);
        if(c2>(n/3))
            res.add(ele2);
        return res;
    }
}