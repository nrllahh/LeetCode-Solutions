package Problem160_IntersectionofTwoLinkedLists;


public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode moveA = headA;
        ListNode moveB = headB;
        int lenA = 0;
        int lenB = 0;
        while (moveA != null) {
            moveA = moveA.next;
            lenA++;
        }
        while (moveB != null) {
            moveB = moveB.next;
            lenB++;
        }
        int diff = Math.abs(lenA - lenB);
        ListNode currA = headA;
        ListNode currB = headB;
        if (lenA > lenB) {
            for (int i = 0; i < diff; i++) {
                currA = currA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                currB = currB.next;
            }
        }
        while (currA != null && currB != null) {
            if (currA == currB) {
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;

    }
}