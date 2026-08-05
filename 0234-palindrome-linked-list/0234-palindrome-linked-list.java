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
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

        }
        ListNode prev=null;

        while(s!=null){
            ListNode next=s.next;
            s.next=prev;
            prev=s;
            s=next;
        }
        ListNode temp=head;
        while(prev!=null){
            if(temp.val!=prev.val)return false;
            temp=temp.next;
            prev=prev.next;
        }
        return true;
    }
}