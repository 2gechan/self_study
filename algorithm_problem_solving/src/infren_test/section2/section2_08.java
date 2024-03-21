package infren_test.section2;

import java.util.Scanner;

public class section2_08 {
    static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int grade = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) grade++;
            }
            answer[i] = grade;

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
        for (int x : solution(n, arr)) System.out.print(x + " ");
    }
}
