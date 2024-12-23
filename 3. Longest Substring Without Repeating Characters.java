class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
       HashSet<Character> h=new HashSet<>();
       int n=s.length();
       int res=0;
       int left=0;
       for(int right=0;right<n;right++)
       {
            char ch=s.charAt(right);
            if(h.contains(ch))
            {
                while(left<right && h.contains(ch))
                {
                    char ch1=s.charAt(left);
                    h.remove(ch1);
                    left++;
                }
            }
            h.add(ch);
            res=Math.max(res,right-left+1);
       }
       return res;    
    }
}