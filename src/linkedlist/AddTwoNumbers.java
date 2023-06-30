package linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode(0);
        ListNode resultIterator = resultList;

        boolean carry = false;

        ListNode pointer1 = l1;
        ListNode pointer2 = l2;

        while(pointer1 != null || pointer2 != null){

            int sum = 0;

            if(pointer1 == null){
                sum += pointer2.val;
                pointer2 = pointer2.next;
            }
            else if(pointer2 == null){
                sum += pointer1.val;
                pointer1 = pointer1.next;
            }
            else{
                sum+= pointer1.val + pointer2.val;
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }

            if(carry){
                sum++;
            }

            if(sum >= 10){
                sum %= 10;
                carry = true;
            }
            else{
                carry = false;
            }

            resultIterator.next = new ListNode(sum);
            resultIterator = resultIterator.next;

        }

        if(carry){
            resultIterator.next = new ListNode(1);
        }

        return resultList.next;
    }
}
