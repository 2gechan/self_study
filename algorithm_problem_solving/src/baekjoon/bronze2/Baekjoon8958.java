package baekjoon.bronze2;

import java.util.Scanner;

public class Baekjoon8958 {

    static int[] solution(int n, String[] arr) {

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int score = 0;
            int sum = 0;
            for (char c : arr[i].toCharArray()) {
                if (c == 'O') sum += ++score;
                else score = 0;
            }
            answer[i] = sum;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for (int result : solution(n, arr)) System.out.println(result);
    }
}
