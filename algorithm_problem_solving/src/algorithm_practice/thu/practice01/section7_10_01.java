package algorithm_practice.thu.practice01;

/*
Tree 말단 노드까지의 가장 짧은 경로(DFS)
 */
public class section7_10_01 {
    static int solution(Node root, int l) {
        if (root.lt == null && root.rt == null) return l;
        else {
            return Math.min(solution(root.lt, l + 1), solution(root.rt, l + 1));
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(solution(root, 0));
    }
}
