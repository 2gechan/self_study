package algorithm_practice.tue.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
회의실 배정
n개의 회의들 중 회의가 겹치지 않게
회의실을 사용할 수 있는 최대수 찾기
 */

class Meeting implements Comparable<Meeting>{
    int sTime;
    int eTime;

    @Override
    public int compareTo(Meeting o) {
        return this.eTime - o.eTime;
    }

    public Meeting(int sTime, int eTime) {
        this.sTime = sTime;
        this.eTime = eTime;
    }
}
public class section9_02_01 {
    static int solution(List<Meeting> list) {
        int answer = 0;
        int et = 0;
        Collections.sort(list);
        for (Meeting m : list) {
            if (m.sTime >= et) {
                et = m.eTime;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.add(new Meeting(s, e));
        }
        System.out.println(solution(list));
    }
}
