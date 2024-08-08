package algorithm_practice.wed.practice01;

import java.util.Scanner;

/*
중복 순열 구하기
1부터 N까지 번호가 적힌 구슬이 있습니다.
이 중 중복을 허락하여 M번을 뽑아 일렬로 나열 하는 방법을 모두 출력합니다.
 */
public class section8_04_01 {
    static int m;
    static int[] ch;
    static void solution(int v, int[] arr) {
        if (v == m) {
            for (int x : ch) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                ch[v] = arr[i];
                solution(v + 1, arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        ch = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        solution(0, arr);
    }
}
