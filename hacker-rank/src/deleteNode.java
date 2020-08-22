public class deleteNode {

    static linkedList.SinglyLinkedListNode deleteNode(linkedList.SinglyLinkedListNode head, int position) {

        linkedList.SinglyLinkedListNode temp = head;
        if(position == 0){
            return head.next;
        }
        int c= 0;
        while(temp.next!=null){
            if(position -1 == c){
                linkedList.SinglyLinkedListNode node = temp.next;
                temp.next =temp.next.next;
                break;
            }
            temp = temp.next;
            c++;
        }
        return head;
    }
}
