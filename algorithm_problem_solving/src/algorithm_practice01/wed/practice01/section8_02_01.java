package algorithm_practice01.wed.practice01;

import java.util.Scanner;

/*
바둑이 승차
철수의 트럭에는 C 킬로그램의 무게가 넘게 태울 수 없다.
N 마리의 바둑이와 각 바둑이의 무게 W 가 주어지면
철수가 태울 수 있는 최대 무게를 구하라
 */
public class section8_02_01 {
    static int answer = 0, c, n;
    static int[] arr;

    static void solution(int m, int weight) {
        if (m == n) {
            if (c < weight) return;
            answer = Math.max(answer, weight);
        }
        else {
            solution(m + 1, weight + arr[m]);
            solution(m + 1, weight);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
