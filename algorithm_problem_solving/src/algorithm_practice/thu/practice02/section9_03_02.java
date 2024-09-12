package algorithm_practice.thu.practice02;

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
public class section9_03_02 {

    static int solution(List<Time> list) {
        int answer = 0;
        int current = 0;

        Collections.sort(list);
        for (Time t : list) {
            if (t.state == 'e') {
                current--;
            }
            else {
                current++;
                answer = Math.max(answer, current);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sTime = sc.nextInt();
            int eTime = sc.nextInt();
            list.add(new Time(sTime, 's'));
            list.add(new Time(eTime, 'e'));
        }
        System.out.println(solution(list));
    }
}
