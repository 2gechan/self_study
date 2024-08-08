package algorithm_practice.wed.practice01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
동전 교환
여러 단위의 동전들이 주어져 있을때
거스름돈을 가장 적은 수의 동전으로 교환 해주려면 어떻게 주면 되는가?
각 단위의 동전은 무한정 쓸 수 있다.
동전의 종류개수 N(1<=N<=12)이 주어진다.
두 번째 줄에는 N개의 동전의 종류가 주어지고,
그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.
각 동전의 종류는 100원을 넘지 않는다.
 */
public class section8_05_01 {
    static Integer[] coins;
    static int answer = Integer.MAX_VALUE;
    static int money;

    static void solution(int sum, int l) {
        if (sum > money) return;
        if (l > answer) return; // 최소 값보다 크면 불필요하므로 즉시 return
        if (sum == money) answer = Math.min(answer, l);
        else {
            for (int i = 0; i < coins.length; i++) {
                solution(sum + coins[i], l + 1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        // 큰 단위부터 구하면 시간복잡도를 조금이라도 줄일 수 있을 것 같다.
        Arrays.sort(coins, Collections.reverseOrder());
        money = sc.nextInt();
        solution(0, 0);
        System.out.println(answer);
    }
}
