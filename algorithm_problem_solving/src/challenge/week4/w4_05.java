package challenge.week4;

import java.util.Scanner;

public class w4_05 {

    static int[] arr;
    static int n, k, answer;

    static boolean flag = false;
    static void solution(int l, int count) {
        if (flag) return;
        if (count > n) {
            answer = -1;
            flag = true;
            return;
        }
        if (l == k) {
            answer = count;
            flag = true;
        }
        else {
            int next = arr[l];
            solution(next, count + 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
