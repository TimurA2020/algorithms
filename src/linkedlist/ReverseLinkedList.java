package linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode buffer;

        while(head != null){
            buffer = head.next;
            head.next = prev;
            prev = head;
            head = buffer;
        }
        return prev;
    }
}
