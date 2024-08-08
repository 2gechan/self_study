package algorithm_practice.tue.practice01;

import java.util.Scanner;

/*
친구인가?(Disjoint-Set : Union&Find)
오늘은 새 학기 새로운 반에서 처음 시작하는 날이다.
현수네 반 학생은 N명이다. 현수는 각 학생들의 친구관계를 알고 싶다.
모든 학생은 1부터 N까지 번호가 부여되어 있고,
현수에게는 각각 두명의 학생은 친구관계가 번호로 표현된 숫자쌍이 주어진다.
만약 (1, 2), (2, 3), (3, 4)의 숫자쌍이 주어지면 1번 학 생과 2번 학생이 친구이고,
2번 학생과 3번 학생이 친구, 3번 학생과 4번 학생이 친구이다.
그리고 1번 학생과 4번 학생은 2번과 3번을 통해서 친구관계가 된다.
학생의 친구관계를 나타내는 숫자쌍이 주어지면
특정 두 명이 친구인지를 판별하는 프로그램 을 작성하세요.
두 학생이 친구이면 “YES"이고, 아니면 ”NO"를 출력한다.
 */
public class section9_06_01 {
    static int[] arr;
    static int find(int v) {
        if (v == arr[v]) return v;
        else return arr[v] = find(arr[v]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) arr[fa] = fb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        if (find(s1) == find(s2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
