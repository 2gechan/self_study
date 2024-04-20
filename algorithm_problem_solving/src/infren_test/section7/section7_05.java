package infren_test.section7;

import java.util.Scanner;


public class section7_05 {
    static void prevDfs(Node root) {
        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            prevDfs(root.lt);
            prevDfs(root.rt);
        }
    }

    static void aftDfs(Node root) {
        if (root == null) return;
        else {
            aftDfs(root.lt);
            aftDfs(root.rt);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        prevDfs(root);
        System.out.println();
        aftDfs(root);
    }
}
