package algorithm_practice.fri.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Problem implements Comparable<Problem> {
    int score;
    int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }

    @Override
    public int compareTo(Problem o) {
        return o.score - this.score;
    }
}

// 최대점수 구하기(냅색 알고리즘)
public class section10_06_02 {

    static int n, m;
    static int[] result;
    static int solution(List<Problem> list) {
        Collections.sort(list);
        for (Problem p : list) {
            int score = p.score;
            int time = p.time;
            for (int i = m; i >= time; i--) {
                result[i] = Math.max(result[i - time] + score, result[i]);
            }
        }
        return result[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        result = new int[m + 1];
        List<Problem> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            list.add(new Problem(score, time));
        }
        System.out.println(solution(list));
    }
}
