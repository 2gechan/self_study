package algorithm_practice.thu.practice01;

/*
이진트리 순회(깊이우선 탐색)
     1
  2    3
4  5  6  7
전위순회 출력 : 1 2 4 5 3 6 7
중위순회 출력 : 4 2 5 1 6 3 7
후위순회 출력 : 4 5 2 6 7 3 1
 */
class Node {
    int num;
    Node lt;
    Node rt;

    public Node(int num) {
        this.num = num;
    }
}
public class section7_05_01 {
    static void solution(Node node) {
        if (node == null) return;
        else {
            // 전위 순회
            System.out.print(node.num + " ");
            solution(node.lt);
            solution(node.rt);

            // 중위 순회
            solution(node.lt);
            System.out.print(node.num + " ");
            solution(node.rt);

            // 후위 순회
            solution(node.lt);
            solution(node.rt);
            System.out.print(node.num + " ");
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
