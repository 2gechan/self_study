package infren_test.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int time;
    char state;

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }
}
public class section9_03 {
    static int solution(List<Time> list) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(list);
        int cnt = 0;
        for (Time x : list) {
            if (x.state == 'e') cnt--;
            else {
                cnt++;
                answer = Math.max(answer, cnt);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            list.add(new Time(st, 's'));
            list.add(new Time(et, 'e'));
        }
        System.out.println(solution(list));
    }
}
