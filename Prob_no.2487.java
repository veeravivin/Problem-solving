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
    public ListNode removeNodes(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        Stack<ListNode> s = new Stack<>();
        ListNode t = head;
        while(t != null){
            while(!s.isEmpty() && s.peek().val<t.val){
                s.pop();
            }
            s.push(t);
            t = t.next;
        }

        head = null;
        while(!s.isEmpty()){
            ListNode d = s.pop();
            d.next = head;
            head = d;
        }
        
        return head;
    }
}