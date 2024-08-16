package challenge.week2;

import java.util.Scanner;

public class w2_05 {

    static int solution(int m, int[] apple) {
        int answer = 0;

        // 스크린의 가장 왼쪽부터 시작하므로 처음의 바구니의 가장 오른쪽 위치는 바구니의 크기다
        int basketRightPosition = m;

        for (int x : apple) {
            // 바구니의 왼쪽 가장 끝 위치
            int basketLeftPosition = basketRightPosition - m + 1;

            // 바구니의 오른쪽 범위에 떨어질 경우
            if (basketRightPosition < x) {
                answer += x - basketRightPosition;
                basketRightPosition = x;
            }
            // 바구니의 왼쪽 범위에 떨어질 경우
            else if (basketLeftPosition > x) {
                answer += basketLeftPosition - x;
                // 왼쪽으로 이동한 만큼 오른쪽 위치 변경
                basketRightPosition = basketRightPosition - (basketLeftPosition - x);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 스크린의 전체 칸
        int m = sc.nextInt(); // 바구니의 크기
        int j = sc.nextInt(); // 떨어질 사과 개수
        int[] apple = new int[j]; // 떨어질 사과들의 위치를 담은 배열
        for (int i = 0; i < j; i++) {
            apple[i] = sc.nextInt();
        }
        System.out.println(solution(m, apple));
    }
}
