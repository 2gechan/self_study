package algorithm_practice.thu.practice01;

import java.util.LinkedList;
import java.util.Queue;

/*
이진트리 순회(넓이우선탐색 : 레벨탐색)
         1
     2       3
   4   5   6   7
   레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
 */
public class section7_07_01 {
    static void solution(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node tmp = q.poll();
            System.out.print(tmp.num + " ");
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
        solution(root);
    }
}
