package algorithm_practice.practice03.thu;

class Node {
    int num;
    Node lt;
    Node rt;

    public Node(int num) {
        this.num = num;
    }
}
public class section7_03_05 {

    static void fDfs(Node node) {
        if (node == null) return;
        else {
            System.out.print(node.num + " ");
            fDfs(node.lt);
            fDfs(node.rt);
        }

    }
    static void mDfs(Node node) {
        if (node == null) return;
        else {
            mDfs(node.lt);
            System.out.print(node.num + " ");
            mDfs(node.rt);
        }
    }
    static void lDfs(Node node) {
        if (node == null) return;
        else {
            lDfs(node.lt);
            lDfs(node.rt);
            System.out.print(node.num + " ");
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
        fDfs(root);
        System.out.println();
        mDfs(root);
        System.out.println();
        lDfs(root);
    }
}
