package algorithm_practice01.wed.practice01;

import java.util.Scanner;

/*
조합 구하기
1부터 N까지 번호가 적힌 구슬이 있습니다.
이 중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.
 */
public class section8_09_01 {
    static int n;
    static int m;
    static int[] arr, ch;
    static void solution(int l, int index) {
        if (l == m) {
            for (int x : ch) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = index; i <= n; i++) {
                ch[l] = arr[i];
                solution(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        ch = new int[m];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        solution(0, 1);
    }
}
