package challenge2.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class w1_05 {

    static int solution(int N, int K, String[] tc, List<Integer> persons) {
        int answer = 0;

        for (int x : persons) {
            boolean flag = true;
            for (int i = x - K; i < x; i++) {
                if (i >= 0 && tc[i].equals("H")) {
                    answer++;
                    flag = false;
                    tc[i] = "E";
                    break;
                }
            }

            // 자기 기준 왼쪽 햄버거를 못먹었을 경우
            if (flag) {
                // 오른쪽 햄버거 먹기
                for (int i = x + 1; i <= x + K; i++) {
                    if (i < N && tc[i].equals("H")) {
                        answer++;
                        tc[i] = "E";
                        break;
                    }
                }
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        String[] tc = sc.nextLine().split("");
        List<Integer> persons = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (tc[i].equals("P")) {
                persons.add(i);
            }
        }
        System.out.println(solution(N, K, tc, persons));
    }
}
