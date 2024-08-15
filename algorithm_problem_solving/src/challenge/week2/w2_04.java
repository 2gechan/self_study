package challenge.week2;

import java.util.Scanner;

public class w2_04 {
    static int solution(int n) {
        int answer = 0;

        int fiveCoin = 0;
        int tmp = 0;

        // 5원을 최대한 넣어준다.
        while (tmp < n) {
            tmp += 5;
            fiveCoin++;
        }

        if (tmp == n) return fiveCoin; // 5원으로 처리 가능한 경우

        answer = fiveCoin;
        for (int i = fiveCoin; i > 0; i--) {
            if (tmp > n) {
                tmp -= 5;
                answer--;
                while (tmp < n) {
                    tmp += 2;
                    answer++;
                }
                if (tmp == n) return answer;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
