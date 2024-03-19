package infren_test.section2;

import java.util.Scanner;

public class section2_02 {
    static int solution(int[] arr) {
        int max = 0;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                answer ++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n];
        for (int i = 0; i < n; i++) {
            student[i] = sc.nextInt();
        }
        System.out.println(solution(student));
    }
}
