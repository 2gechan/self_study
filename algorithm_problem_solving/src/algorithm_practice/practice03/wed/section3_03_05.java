package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section3_03_05 {

    static int solution(int n) {
        int answer = 0;

        int lt = 1;
        int sum = 0;
        for (int rt = 1; rt < n; rt++) {
            sum += rt;
            if (sum >= n) {
                if (sum == n) answer++;
                while (sum >= n) {
                    sum -= lt++;
                    if (sum == n) answer++;
                }
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
