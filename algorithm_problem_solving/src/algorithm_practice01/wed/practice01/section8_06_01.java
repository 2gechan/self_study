package algorithm_practice01.wed.practice01;

import java.util.Scanner;

/*
순열 구하기
10이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
 */
public class section8_06_01 {
    static int m;
    static int[] arr, ch, result;

    static void solution(int l) {
        if (l == m) {
            for (int x : result) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (ch[i] == 1) continue;
                ch[i] = 1;
                result[l] = arr[i];
                solution(l + 1);
                ch[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0);
    }
}
