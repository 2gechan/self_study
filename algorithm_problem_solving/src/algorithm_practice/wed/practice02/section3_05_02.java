package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section3_05_02 {

    static int solution(int n) {
        int answer = 0;

        int lt = 1, sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= lt++;
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
