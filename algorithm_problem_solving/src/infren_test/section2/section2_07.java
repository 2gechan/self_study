package infren_test.section2;

import java.util.Scanner;

public class section2_07 {
    static int solution(int n, int[] arr) {
        int answer = 0;
        int stack = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                stack++;
                answer += stack;
            } else {
                stack = 0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
