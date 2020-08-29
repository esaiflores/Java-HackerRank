import java.util.Scanner;
import java.util.Stack;

public class treePreorderTraversal {

    static class Node {
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

/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/

        public static void preOrder(Node root) {

            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()) {
                Node node = stack.pop();
                if (node != null) {
                    System.out.print(node.data + " ");
                    stack.push(node.right);
                    stack.push(node.left);
                }
            }

        }

        public static Node insert(Node root, int data) {
            if(root == null) {
                return new Node(data);
            } else {
                Node cur;
                if(data <= root.data) {
                    cur = insert(root.left, data);
                    root.left = cur;
                } else {
                    cur = insert(root.right, data);
                    root.right = cur;
                }
                return root;
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            Node root = null;
            while(t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            scan.close();
            preOrder(root);
        }
    }
}
