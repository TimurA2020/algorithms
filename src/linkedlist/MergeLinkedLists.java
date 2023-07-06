package linkedlist;

public class MergeLinkedLists {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode emptyNode = dummy;

        while (list1 != null && list2 != null) {

            if(list1.val < list2.val) {
                emptyNode.next = list1;
                list1 = list1.next;
            } else {
                emptyNode.next = list2;
                list2 = list2.next;
            }

            emptyNode = emptyNode.next;
        }

        if (list1 != null) {
            mergeOneSide(list1, emptyNode);
        }

        if (list2 != null) {
            mergeOneSide(list2, emptyNode);
        }

        return dummy.next;
    }

    private void mergeOneSide(ListNode list1, ListNode result) {
        if(list1 == null) {
            return;
        }

        result.next = list1;

        mergeOneSide(list1.next, result.next);
    }
}
