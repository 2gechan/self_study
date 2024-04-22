package infren_test.section7;

import java.util.LinkedList;
import java.util.Queue;

public class section7_07 {
    static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node tmp = q.poll();
            System.out.print(tmp.data + " ");
            if (tmp.lt != null) q.offer(tmp.lt);
            if (tmp.rt != null) q.offer(tmp.rt);
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
        bfs(root);
    }
}
