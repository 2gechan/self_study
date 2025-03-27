package algorithm_practice.practice03.thu;

public class section7_03_09 {
    static int answer = Integer.MAX_VALUE;
    static void solution(Node node, int l) {
        if (node.lt == null && node.rt == null) answer = Math.min(answer, l);
        else {
            solution(node.lt, l + 1);
            solution(node.rt, l + 1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        solution(root, 0);
        System.out.println(answer);
    }
}
