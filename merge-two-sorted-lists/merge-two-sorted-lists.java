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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2== null)return l1;
        ListNode ans=null;
        ListNode head=null;
        if(l1.val<=l2.val){
            ans=head=l1;
            l1=l1.next;
        }else{
            ans=head=l2;
            l2=l2.next;
        }
        
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ans.next=l1;
                ans=l1;
                l1=l1.next;
            }else{
                ans.next=l2;
                ans=l2;
                l2=l2.next;
            }
        }
        if(l1==null){
            ans.next=l2;
        }else{
            ans.next=l1;
        }
        return head;
    }
}