package algorithm_practice.thu.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
    int st;
    int et;

    public Meeting(int st, int et) {
        this.st = st;
        this.et = et;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.et == o.et) return this.st - o.st;
        else return this.et - o.et;
    }
}
public class section9_02_02 {

    static int solution(List<Meeting> list) {
        int answer = 0;
        Collections.sort(list);

        int end = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).st >= end) {
                end = list.get(i).et;
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
            int st = sc.nextInt();
            int et = sc.nextInt();
            list.add(new Meeting(st, et));
        }
        System.out.println(solution(list));
    }
}
