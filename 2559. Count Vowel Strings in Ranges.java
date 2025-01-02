class Solution 
{
    public int[] vowelStrings(String[] words, int[][] queries) 
    {
        int[] res=new int[queries.length];
        int n=words.length;
        int[] prefix=new int[n];
        for(int i=0;i<n;i++)
        {
            String word=words[i];
            char first=word.charAt(0);
            char last=word.charAt(word.length()-1);
            if(checkVowel(first)&&checkVowel(last))
            {
                if(i==0)
                    prefix[0]=1;
                else
                    prefix[i]=prefix[i-1]+1;
            }
            else
            {
                if(i==0)
                    prefix[0]=0;
                else
                    prefix[i]=prefix[i-1];
            }
        }
        for(int i=0;i<queries.length;i++)
        {
            int[] query=queries[i];
            if(query[0]!=0)
            {
                res[i]=prefix[query[1]]-prefix[query[0]-1];
            }
            else
                res[i]=prefix[query[1]];
        }
        return res;
    }
    public boolean checkVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        return false;
    }
}