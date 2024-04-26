package infren_test.section7;

import java.util.LinkedList;
import java.util.Queue;

public class section7_09 {
    static int dfs(int l, Node root) {
        if (root.lt == null && root.rt == null) return l;
        else return Math.min(dfs(l + 1, root.lt), dfs(l + 1, root.rt));
    }

    static int bfs(Node root) {
        int answer = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node tmp = q.poll();
                if (tmp.lt == null && tmp.rt == null) {
                    return answer;
                }
                if (tmp.lt != null) q.offer(tmp.lt);
                if (tmp.rt != null) q.offer(tmp.rt);
            }
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(dfs(0, root));
        System.out.println(bfs(root));
    }
}
