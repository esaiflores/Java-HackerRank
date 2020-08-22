public class printInReverse {

    static void reversePrint(reversedList.SinglyLinkedListNode head) {

        if(head.next!=null) reversePrint(head.next);
        System.out.println(head.data);
    }


}
