package infren.section6;

import java.util.Scanner;

// LRU 알고리즘 : 가장 오랫동안 사용하지 않은 작업을 삭제한다.
public class section6_04 {
    static int[] solution(int s, int[] t, int work) {
        for (int i = 0; i < s; i++) {
            if (t[i] == work) {
                int tmp = work;
                for (int j = i; j > 0; j--) {
                    // 1 2 3 4 5
                    t[j] = t[j - 1];
                }
                t[0] = tmp;
                return t;
            }
        }
        for (int i = s - 1; i > 0; i--) {
            t[i] = t[i - 1];
        }
        t[0] = work;
        return t;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 캐시의 크기
        int n = sc.nextInt(); // 작업 횟수
        int[] t = new int[s];
        for (int i = 0; i < n; i++) {
            t = solution(s, t, sc.nextInt());
        }
        for (int i = 0; i < s; i++) {
            System.out.print(t[i] + " ");
        }
    }
}
