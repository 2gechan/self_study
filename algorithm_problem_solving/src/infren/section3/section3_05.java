package infren.section3;

import java.util.Scanner;

public class section3_05 {
    static int solution(int n) {
        int lt = 1, rt = 1, count = 0, sum = 0;
        while (rt < n) {
            sum += rt++;
            if (sum == n) count ++;
            while (sum >= n) {
                sum -= lt++;
                if (sum == n) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
