package algorithm_practice.mon.practice01;

import java.util.Arrays;
import java.util.Scanner;

/*
동전교환(냅색 알고리즘)
여러 단위의 동전들이 주어져 있을때
거스름돈을 가장 적은 수의 동전으로 교환 해주려면 어떻게 주면 되는가?
각 단위의 동전은 무한정 쓸 수 있다.
첫 번째 줄에는 동전의 종류개수 N(1<=N<=50)이 주어진다.
두 번째 줄에는 N개의 동전의 종류가 주어지고,
그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.
각 동전의 종류는 100원을 넘지 않는다.
 */
public class section10_05_01 {
    static int[] dy;
    static int solution(int[] arr, int m) {
        Arrays.sort(arr);
        dy[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            for (; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }
        return dy[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        dy = new int[m + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        System.out.println(solution(arr, m));
    }
}
