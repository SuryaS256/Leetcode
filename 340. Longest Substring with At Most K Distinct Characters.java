class Solution 
{
    public int lengthOfLongestSubstringKDistinct(String s, int k) 
    {
        int n=s.length();
        int res=0;
        int i=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int j=0;j<n;j++)
        {
            char ch=s.charAt(j);
            h.put(ch,h.getOrDefault(ch,0)+1);
            while (h.size()>k) 
            {
                char ch1=s.charAt(i);
                h.put(ch1,h.get(ch1)-1);
                if(h.get(ch1)==0)
                    h.remove(ch1);
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}