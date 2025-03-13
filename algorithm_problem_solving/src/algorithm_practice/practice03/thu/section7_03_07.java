package algorithm_practice.practice03.thu;

import java.util.LinkedList;
import java.util.Queue;

public class section7_03_07 {

    static String solution(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            sb.append(node.num + " ");

            if (node.lt != null) queue.offer(node.lt);
            if (node.rt != null) queue.offer(node.rt);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        System.out.println(solution(root));
    }
}
