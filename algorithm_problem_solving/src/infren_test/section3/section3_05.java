package infren_test.section3;

import java.util.Scanner;

public class section3_05 {
    static int solution(int n) {
        int answer = 0, sum = 0, lt = 1;
        for (int rt = 1; rt < n; rt++) {
            sum += rt;
            if (sum == n) answer ++;
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
