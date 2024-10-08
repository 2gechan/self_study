package algorithm_practice.tue.practice02;

class Node {
    int num;
    Node lt, rt;

    public Node(int num) {
        this.num = num;
    }
}

public class section7_05_02 {

    static void front(Node node) {
        if (node == null) return;
        else {
            System.out.print(node.num + " ");
            front(node.lt);
            front(node.rt);
        }
    }

    static void middle(Node node) {
        if (node == null) return;
        else {
            middle(node.lt);
            System.out.print(node.num + " ");
            middle(node.rt);
        }
    }

    static void back(Node node) {
        if (node == null) return;
        else {
            back(node.lt);
            back(node.rt);
            System.out.print(node.num + " ");
        }
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.lt = new Node(2);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt = new Node(3);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        front(root);
        System.out.println();
        middle(root);
        System.out.println();
        back(root);
    }
}
