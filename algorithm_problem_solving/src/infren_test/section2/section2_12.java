package infren_test.section2;

import java.util.Scanner;

public class section2_12 {
    static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) { // m번의 테스트
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) { // 테스트 결과 한줄 비교
                        if (arr[k][s] == i) pi = s; // 기준 대상 등수
                        if (arr[k][s] == j) pj = s; // 기준 대상과 비교할 대상
                    }
                    if(pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arr));
    }
}
