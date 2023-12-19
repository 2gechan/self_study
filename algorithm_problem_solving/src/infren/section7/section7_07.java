package infren.section7;

import java.util.LinkedList;
import java.util.Queue;

// bfs를 이용한 넓이 우선 탐색
public class section7_07 {
    static Node root;
    static void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) q.offer(cur.lt);
                if (cur.rt != null) q.offer(cur.rt);
            }
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
        bfs(root);
    }
}
