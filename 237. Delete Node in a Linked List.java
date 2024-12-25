class Solution 
{
    public void deleteNode(ListNode node) 
    {
        ListNode temp=node;
        if(temp.next.next==null)
        {
            temp.val=temp.next.val;
            temp.next=null;
        }        
        else
        {
            temp.val=temp.next.val;
            temp.next=temp.next.next;
        }
    }
}