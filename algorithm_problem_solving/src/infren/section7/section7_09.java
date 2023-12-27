package infren.section7;


// 제일 가까운 말단노드까지의 거리 찾기(dfs - 깊이 우선 알고리즘)
public class section7_09 {
    static int l = 0;
    static int dfs(int n, Node node) {
        if (node.lt == null && node.rt == null) return n;
        else return Math.min(dfs(n + 1, node.lt), dfs(n + 1, node.rt));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt = new Node(3);
        dfs(0, root);
    }
}
