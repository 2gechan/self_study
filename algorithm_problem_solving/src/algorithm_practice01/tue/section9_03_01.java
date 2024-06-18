package algorithm_practice01.tue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
결혼식
피로연장에 동시에 존재하는 최대 인원수 구하기
하객이 가는시간이 된다면 가는시간엔 장소에 없는 상태
ex) 7 12이면 12시에는 존재하지 않는다.
 */
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
public class section9_03_01 {

    static int solution(List<Time> list) {
        int answer = 0;
        int max = 0;
        Collections.sort(list);
        for (Time x : list) {
            if (x.state == 's') answer++;
            else answer--;
            max = Math.max(max, answer);
        }

        return max;
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
