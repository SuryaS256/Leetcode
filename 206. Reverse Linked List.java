class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        if(head==null)
            return null;
        ListNode cur=head;
        ListNode prev=null;
        ListNode next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
        return head;
    }
}