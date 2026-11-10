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

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode Fast = head;
        ListNode Slow = head;
        while(Fast != null && Fast.next != null){
            Fast = Fast.next.next;
            Slow = Slow.next;
            if(Fast == Slow){
                return true;
            }
        }
        return false;
    }
}
