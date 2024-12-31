class Solution 
{
    public String reverseVowels(String s) 
    {
        int n=s.length();
        int i=0;
        int j=n-1;
        char ch[]=s.toCharArray();
        while(i<j)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(checkVowel(ch1)&&checkVowel(ch2))
            {
                ch[i]=ch2;
                ch[j]=ch1;
                i++;
                j--;
            }
            else if(checkVowel(ch1)==false && checkVowel(ch2)==false)
            {
                i++;
                j--;
            }
            else if(checkVowel(ch1)==false)
            {
                i++;
            }
            else if(checkVowel(ch2)==false)
            {
                j--;
            }
        }
        String res=new String(ch);
        return res;        
    }
    public boolean checkVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }
}