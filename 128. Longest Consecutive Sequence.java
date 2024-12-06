class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length==0)
            return 0;
        HashSet<Integer> h=new HashSet<>();
        for(int num:nums)
        {
            h.add(num);
        }
        int longestStreak=0;
        for(int num:h)
        {
            if(!h.contains(num-1))
            {
                int currentStreak=1;
                int currentnum=num;
                while(h.contains(currentnum+1))
                {
                    currentnum+=1;
                    currentStreak+=1;
                }
                longestStreak=Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }
}
