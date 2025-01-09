class Solution 
{
    public int prefixCount(String[] words, String pref) 
    {
        int count=0;
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            String s1=words[i];
            if(s1.indexOf(pref)==0)
                count++;
        }
        return count;
    }
}