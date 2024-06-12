package algorithm_practice01.wed;

import java.util.Scanner;

/*
합이 같은 부분집합
N개의 자연수로 이루어진 자연수 집합이 주어지면
이 집합을 두개의 부분집합으로 나누었을 때
두 부분집합의 합이 같으면 YES, 아니면 NO
 */
public class section8_01_01 {
    static int[] ch;
    static int n, sum = 0;
    static boolean flag = false;
    static void solution(int x, int[] arr) {
        if (flag) return;
        if (x == n) {
            int result = 0;
            for (int i = 0; i < n; i++) {
                if (ch[i] == 1) result += arr[i];
            }
            if (result == sum / 2) flag = true;
        }
        else {
            ch[x] = 1;
            solution(x + 1, arr);
            ch[x] = 0;
            solution(x + 1, arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        ch = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            sum += num;
        }
        solution(0, arr);
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
