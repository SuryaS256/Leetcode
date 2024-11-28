class Solution 
{
    public int[] twoSum(int[] a, int target) 
    {
        int n=a.length;
        int[] res=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>(); 
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(target-a[i]))
            {
                res[0]=h.get(target-a[i]);
                res[1]=i;
                break;
            }
            h.put(a[i], i);
        }
        return res;
    }
}