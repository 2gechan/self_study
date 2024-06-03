package algorithm_practice01.mon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
최대점수 구하(냅색 알고리즘)
제한시간 M안에 N개의 문제 중 최대점수 구하기
# 한 유형당 한개만 풀 수 있다.
 */
class Problem implements Comparable<Problem> {
    int score;
    int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }

    @Override
    public int compareTo(Problem o) {
        return o.score - this.score; // 배점이 높은 순으로 내림차순
    }
}
public class section10_06_01 {
    static int m;
    static int[] arr;

    static int solution(List<Problem> list) {

        for (Problem tmp : list) {
            int score = tmp.score;
            int time = tmp.time;
            for (int i = m; i >= time; i--) {
                if (arr[i - time] + score > arr[i]) arr[i] = arr[i - time] + score;
            }
        }

        return arr[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m + 1];
        List<Problem> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            list.add(new Problem(s, t));
        }
        System.out.println(solution(list));
    }
}
