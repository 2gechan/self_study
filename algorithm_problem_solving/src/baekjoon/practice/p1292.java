package baekjoon.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1292 {
    static int solution(int s, int e) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int num = 1;
        while (list.size() < e) {
            for (int i = 0; i < num; i++) {
                list.add(num);
                if (list.size() >= s && list.size() <= e) answer += num;
            }
            num++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(solution(s, e));
    }
    // 1 2 /2 3 3 3 4/ 4 4 5 5 5

}
