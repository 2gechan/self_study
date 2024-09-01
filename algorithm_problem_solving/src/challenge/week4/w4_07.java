package challenge.week4;

import java.util.*;

public class w4_07 {
    static int n, m, a, b;

    static List<List<Integer>> list;
    static boolean[] visit;
    static boolean flag = false;
    static int answer = -1;
    static void solution(int l, int b, int count) {
        visit[l] = true;
        if (flag) return;
        if (l == b) {
            answer = count;
            flag = true;
        }
        else {
            for (int x : list.get(l)) {
                if (!visit[x]) solution(x, b, count + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 전체 사람의 수

        a = sc.nextInt(); // 촌수를 계산해야 하는 사람 번호 1
        b = sc.nextInt(); // 촌수를 계산해야 하는 사람 번호 2

        m = sc.nextInt(); // 부모 자식 간의 관계의 개수

        list = new ArrayList<>();
        visit = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(); // y의 부모 번호
            int y = sc.nextInt(); // x의 자식
            list.get(x).add(y);
            list.get(y).add(x);
        }
        solution(a, b, 0);
        System.out.println(answer);

    }
}
