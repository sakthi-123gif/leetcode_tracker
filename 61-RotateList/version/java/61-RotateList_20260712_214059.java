// Last updated: 7/12/2026, 9:40:59 PM
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        int len = 0;
4        
5        // 1. Handle edge cases
6        if (head == null || head.next == null) return head;
7        
8        // 2. Find the length and the original tail
9        ListNode count = head;
10        while (count.next != null) {
11            len++;
12            count = count.next;
13        }
14        len++; // Account for the final node
15        
16        // 3. Optimize k
17        k = k % len;
18        
19        // 4. Locate the new tail
20        ListNode p = head;
21        for (int i = 0; i < (len - k - 1); ++i) {
22            p = p.next;
23        }
24        
25        // 5 & 6. Form the circle, set new head, and break it
26        count.next = head;
27        head = p.next;
28        p.next = null;
29        
30        // 7. Return the new rotated list
31        return head;
32    }
33}