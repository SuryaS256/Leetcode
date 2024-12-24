class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null||head.next==null)
            return null;
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode cur=head;
        while(n!=0)
        {
            cur=cur.next;
            n--;
        }
        ListNode prev=temp;
        while (cur!=null)
        {
            cur=cur.next;
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return temp.next;
    }
}