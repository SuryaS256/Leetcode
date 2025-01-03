class Solution 
{
    public int majorityElement(int[] a) 
    {
       int res=0;
       int count=1;
       int n=a.length;
       for(int i=1;i<n;i++)
       {
            if(a[i]==a[res])
                count++;
            else
                count--;
            if(count==0)
            {
                res=i;
                count=1;
            }
       }
       count=0; 
       for(int i=0;i<n;i++)
       {
            if(a[i]==a[res])
                count++;
       }
        if(count>n/2)
            return a[res];
        return -1;

    }
}