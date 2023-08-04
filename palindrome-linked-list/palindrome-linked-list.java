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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode cur=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pal=reverseNode(slow.next);
        while(pal!=null){
            if(cur.val!=pal.val)
                return false;
            cur=cur.next;
            pal=pal.next;
        }
        return true;
    }
    public ListNode reverseNode(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode prev=head;
        ListNode cur=head.next;
        head.next=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}