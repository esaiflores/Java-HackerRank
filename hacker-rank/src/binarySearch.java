import java.util.Scanner;

public class binarySearch {


    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class Solution {

        public static void preOrder( Node root ) {

            if( root == null)
                return;

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

        public static void insert(Node root, int data) {


        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            Node root = null;
            while(t-- > 0) {
                int data = scan.nextInt();
                insert(root, data);
            }
            scan.close();
            preOrder(root);
        }
    }
}
