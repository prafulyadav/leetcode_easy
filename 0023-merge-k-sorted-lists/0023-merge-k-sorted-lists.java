/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode merge2Lists(ListNode h1, ListNode h2)
    {
        ListNode head= new ListNode(0);
        ListNode dummy = head;
        while(h1 != null && h2!=null)
        {
            if(h1.val <= h2.val)
            {
                dummy.next=h1;
                h1=h1.next;
            }
            else
            {
                dummy.next=h2;
                h2=h2.next;
            }
            dummy=dummy.next;
        }
        if(h1!=null)
            dummy.next = h1;
        if(h2!=null)
            dummy.next = h2;
        return head.next;
    }
    
    public ListNode mergeKLists(ListNode[] lists) 
    {
        int n=lists.length,i,interval=1;
        if(n==0){
            return null;
        }
        while(interval<n){
             for( i=0;i+interval<n;i+=interval*2)
             {
                 lists[i]=merge2Lists(lists[i],lists[i+interval]);
            
            }
            interval=interval*2;
        }
         return lists[0];
    }
}