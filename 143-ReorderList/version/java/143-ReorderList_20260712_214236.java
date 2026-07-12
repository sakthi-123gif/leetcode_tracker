// Last updated: 7/12/2026, 9:42:36 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 * int val;
5 * ListNode next;
6 * ListNode() {}
7 * ListNode(int val) { this.val = val; }
8 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        // Base Case: If the list is empty or has only 1 node, no reordering is needed
14        if (head == null || head.next == null) {
15            return;
16        }
17        
18        // Step 1: Find the middle of the linked list 🐢🐇
19        ListNode slow = head;
20        ListNode fast = head;
21        while (fast != null && fast.next != null) {
22            slow = slow.next;
23            fast = fast.next.next;
24        }
25        
26        // Step 2: Reverse the second half of the list in-place 🔃
27        ListNode prev = null;
28        ListNode curr = slow.next;
29        slow.next = null; // Split the list into two separate halves
30        ListNode next;
31        
32        while (curr != null) {
33            next = curr.next;
34            curr.next = prev;
35            prev = curr;
36            curr = next;
37        }
38
39        // Step 3: Interleave the first half and the reversed second half ✂️🤝
40        ListNode left = head;
41        curr = prev; // Head of the reversed second half
42
43        while (curr != null) {
44            ListNode temp1 = left.next; // Save next node of first half
45            ListNode temp2 = curr.next; // Save next node of second half
46
47            // Connect left node to right node
48            left.next = curr;
49            // Connect right node to saved next left node
50            curr.next = temp1;
51            
52            // Move pointers forward for the next iteration
53            left = temp1;
54            curr = temp2;
55        }
56    }
57}