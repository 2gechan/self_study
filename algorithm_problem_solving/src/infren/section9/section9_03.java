package infren.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int time;
    char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}
// 같은 시간대에 존재하는 최대 인원 수 구하기
public class section9_03 {
    static int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for (Time o : arr) {
            if (o.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Time(s, 's'));
            arr.add(new Time(e, 'e'));
        }
        System.out.println(solution(arr));

    }
}
