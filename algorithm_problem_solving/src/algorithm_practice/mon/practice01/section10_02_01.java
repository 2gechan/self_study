package algorithm_practice.mon.practice01;

import java.util.Scanner;

/*
돌다리 건너기
돌다리를 건널때 한개 또는 두개의 돌다리에 올라올 수 있을 때
돌다리를 건널 수 있는 경우의 수 구하기
 */
public class section10_02_01 {
    static int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
