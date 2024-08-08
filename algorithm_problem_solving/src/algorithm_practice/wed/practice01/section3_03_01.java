package algorithm_practice.wed.practice01;

import java.util.Scanner;

/*
최대 매출
현수의 아빠는 제과점을 운영합니다.
현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속 된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 15 11 20 25 10 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다. 여러분이 현수를 도와주세요.
 */
public class section3_03_01 {
    static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int tmp = 0;
        for (int i = 0; i < k; i++) {
            tmp += arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            tmp = tmp - arr[i - k] + arr[i];
            answer = Math.max(answer, tmp);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
