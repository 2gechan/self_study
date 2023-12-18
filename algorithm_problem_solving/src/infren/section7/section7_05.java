package infren.section7;

class Node {
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
        lt=rt=null;
    }
}

// 이진트리 전위, 중위, 후위 순회
public class section7_05 {
    static Node root;

    static void dfs(Node root) {
        if (root == null) return;
        else {
            dfs(root.lt);
            dfs(root.rt);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt = new Node(3);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        dfs(root);
    }
}
