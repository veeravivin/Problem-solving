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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // push all nodes
        Stack<ListNode> s = new Stack<>();
        ListNode t = head;
        while (t != null) {
            s.push(t);
            t = t.next;
        }

        int n = s.size();            
        int ops = n / 2;             
        ListNode cur = head;

        for (int i = 0; i < ops; i++) {
            ListNode tail = s.pop();       
            if (cur == tail) break;        

            ListNode next = cur.next;      
            cur.next = tail;               
            tail.next = next;              
            cur = next;                    
        }

        if (cur != null) cur.next = null;
    }
}
