package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_12 {

    static int solution(int n, int m, int[][] arr) {

        int answer = 0;

        for (int i = 1; i <= n; i++) { // 기준 학생
            for (int j = 1; j <= n; j++) { // 비교 학생

                int cnt = 0; // 기준 학생이 비교 학생 보다 몇번 앞섰는지 횟수 체크

                for (int k = 0; k < m; k++) {
                    int pi = 0; // 기준 대상의 k 번째 테스트 에서 등수
                    int pj = 0; // 비교 대상의 k 번째 테스트 에서 등수
                    for (int l = 0; l < n; l++) {

                        if (arr[k][l] == i) pi = l;
                        if (arr[k][l] == j) pj = l;
                    }

                    // 기준 학생이 등수가 높은 경우
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++; // 모든 테스트에서 등수가 높았는 지 확인


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
