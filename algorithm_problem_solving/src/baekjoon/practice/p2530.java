package baekjoon.practice;

import java.util.Scanner;

public class p2530 {
    static String[] solution(String[] tc, int n) {
        String[] answer = new String[3];
        int time = Integer.parseInt(tc[0]);
        int min = Integer.parseInt(tc[1]);
        int sec = Integer.parseInt(tc[2]);
        int mm = 0;
        sec += n;
        if (sec >= 60) {
            mm = sec / 60;
            sec = sec % 60;
            min += mm;
            if (min >= 60) {
                time += min / 60;
                min = min % 60;
                while (time >= 24) {
                    time -= 24;
                }
            }
        }
        answer[0] = "" + time;
        answer[1] = "" + min;
        answer[2] = "" + sec;

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tc = sc.nextLine().split(" ");
        int n = sc.nextInt();
        for (String x : solution(tc, n)) System.out.print(x + " ");
    }

}
