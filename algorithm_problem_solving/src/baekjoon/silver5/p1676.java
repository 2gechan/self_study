package baekjoon.silver5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1676 {
    static int solution(int n) {
        int answer = 0;
        // n!값에 0이 들어가는 경우는 n!에 2와 5가 곱해지는 경우이다.
        // 따라서, 2와 5가 몇번씩 곱해지냐에 따라 0의 개수가 달라지는데
        // 2는 5보다 작기 때문에 5보다 곱해지는 경우가 더 많다.
        // 그러므로 5가 몇번 곱해지는지에 대해서만 구하면 된다.
        while (n >= 5) {
            answer += n / 5;
            n /= 5;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
