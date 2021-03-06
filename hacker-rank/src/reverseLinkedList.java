import java.io.BufferedWriter;
import java.io.IOException;

public class reverseLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static reversedList.SinglyLinkedListNode reverse(reversedList.SinglyLinkedListNode head) {
        if(head == null)
            return null;

        reversedList.SinglyLinkedListNode revNode = null;

        while(head != null){
            reversedList.SinglyLinkedListNode next = head.next;
            head.next = revNode;
            revNode = head;
            head = next;
        }
        return revNode;


    }

}
