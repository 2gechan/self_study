package baekjoon.practice;

import java.util.Scanner;

public class p3003 {
    static int[] t = {1, 1, 2, 2, 2, 8};
    static int[] solution(int[] arr) {
        int[] answer = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            while (arr[i] > t[i]) {
                arr[i] = --arr[i];
                cnt--;
            }
            while (arr[i] < t[i]) {
                arr[i] = ++arr[i];
                cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] white = new int[6];
        for (int i = 0; i < 6; i++) {
            white[i] = sc.nextInt();
        }
        for (int x : solution(white)) System.out.print(x + " ");
    }
}
