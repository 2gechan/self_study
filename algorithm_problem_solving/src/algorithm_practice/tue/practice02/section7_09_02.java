package algorithm_practice.tue.practice02;

import java.util.LinkedList;
import java.util.Queue;

// Tree 말단 노드까지의 가장 짧은 경로
public class section7_09_02 {

    static int solution(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while (!q.isEmpty()) {

            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node tmp = q.poll();
                if (tmp.lt == null && tmp.rt == null) return level;
                if (tmp.lt != null) q.offer(tmp.lt);
                if (tmp.rt != null) q.offer(tmp.rt);
            }
            level++;

        }

        return level;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(solution(root));
    }
}
