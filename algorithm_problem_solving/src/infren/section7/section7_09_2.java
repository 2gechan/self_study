package infren.section7;


import java.util.LinkedList;
import java.util.Queue;

// 제일 가까운 말단노드까지의 거리 찾기(bfs - 넓이 우선 알고리즘)
public class section7_09_2 {
    static int bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        int l = 0;
        q.offer(node);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node n = q.poll();
                if (n.lt == null && n.rt == null) return l;
                if (n.lt != null) q.offer(n.lt);
                if (n.rt != null) q.offer(n.rt);
            }
            l++;
        }

        return 0;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt = new Node(3);
        bfs(root);
    }
}
