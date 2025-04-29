package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
public class Baekjoon1991 {

    static Node head = new Node('A', null, null);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            insertNode(head, root, left, right);
        }

        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);
    }

    static void insertNode(Node head, char root, char left, char right) {

        if (head.value == root) {
            head.left = left == '.' ? null : new Node(left, null, null);
            head.right = right == '.' ? null : new Node(right, null, null);
        }
        else {
            if (head.left != null) insertNode(head.left, root, left, right);
            if (head.right != null) insertNode(head.right, root, left, right);
        }
    }

    static void preOrder(Node node) { // 전위

        if (node == null) return;

        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node) { // 중위

        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    }

    static void postOrder(Node node) { // 후위

        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }
}
