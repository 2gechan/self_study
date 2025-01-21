package algorithm_practice.practice03.tue;

import java.util.*;

class TimeFlag implements Comparable<TimeFlag> {
    int time;
    char flag;

    public TimeFlag(int time, char flag) {
        this.time = time;
        this.flag = flag;
    }

    @Override
    public int compareTo(TimeFlag o) {
        if (this.time == o.time) return this.flag - o.flag;
        else return this.time - o.time;
    }
}
public class section9_03_03 {

    static int solution(List<TimeFlag> list) {

        Collections.sort(list);
        int answer = 0;
        int cnt = 0;
        for (TimeFlag t : list) {

            if (t.flag == 's') {
                cnt++;
            }
            else {
                cnt--;
            }
            answer = Math.max(cnt, answer);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<TimeFlag> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new TimeFlag(sc.nextInt(), 's'));
            list.add(new TimeFlag(sc.nextInt(), 'e'));
        }

        System.out.println(solution(list));
    }
}
