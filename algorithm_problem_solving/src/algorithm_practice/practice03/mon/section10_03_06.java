package algorithm_practice.practice03.mon;

import java.util.*;

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
public class section10_03_06 {

    static int solution(List<Problem> list, int m) {

        int[] answer = new int[m + 1];
        Collections.sort(list);
        for (Problem p : list) {
            int time = p.time;
            int score = p.score;
            for (int i = m; i >= time; i--) {
                if (answer[i - time] + score > answer[i]) answer[i] = answer[i - time] + score;
            }
        }

        return answer[m];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Problem> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            list.add(new Problem(score, time));
        }
        System.out.println(solution(list, m));
    }
}
