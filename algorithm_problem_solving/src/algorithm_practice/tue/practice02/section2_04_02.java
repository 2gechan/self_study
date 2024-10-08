package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section2_04_02 {

    static int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : solution(n)) System.out.print(x + " ");
    }
}
