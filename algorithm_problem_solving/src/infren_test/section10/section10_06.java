package infren_test.section10;

import java.util.*;

class Prm implements Comparable<Prm> {
    int score;
    int time;

    public Prm(int score, int time) {
        this.score = score;
        this.time = time;
    }

    @Override
    public int compareTo(Prm o) {
        return this.time - o.time;
    }
}
public class section10_06 {
    static int[] dy;
    static int solution(List<Prm> list, int m) {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            Prm tmp = list.get(i);
            for (int j = m; j >= tmp.time; j--) {
                dy[j] = Math.max(dy[j], dy[j - tmp.time] + tmp.score);
            }
        }

        return dy[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        dy = new int[m + 1];
        List<Prm> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            list.add(new Prm(s, t));
        }
        System.out.println(solution(list, m));
    }
}
