package algorithm_practice01.tue;

import java.util.Scanner;

/*
가위 바위 보
A, B 두 사람이 가위바위보 게임을 합니다.
총 N번의 게임을 하여 A가 이기면 A를 출력하고,
B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면
각 회를 누가 이겼는지 출력하는 프로그램 을 작성하세요.
 */
public class section2_03_01 {
    static String[] solution(int n, int[] A, int[] B) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            if (A[i] == 1 && B[i] == 3) answer[i] = "A";
            else if (A[i] == 2 && B[i] == 1) answer[i] = "A";
            else if (A[i] == 3 && B[i] == 2) answer[i] = "A";
            else if (A[i] == B[i]) answer[i] = "D";
            else answer[i] = "B";
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        for (String x : solution(n, A, B)) System.out.println(x);
    }
}
