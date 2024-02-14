package infren.section9;

import java.util.Scanner;

// 연관 관계 찾기, Disjoint-Set : Union % Find
// 1부터 N까지 학생들 중 1번 학생과 2번 학생이 친구고 2번과 3번 그리고 3번과 4번이 친구다.
// 그럼 1번은 2번과 3번을 통해 4번과 친구다.
public class section9_06 {
    static int[] unf;

    public static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }
    }
}
