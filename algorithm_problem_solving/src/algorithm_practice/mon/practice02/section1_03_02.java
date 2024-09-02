package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section1_03_02 {
    static String solution(String line) {
        String answer = "";

        String tmp = "";
        for (char c : line.toCharArray()) {
            if (c == ' ') {
                if (tmp.length() > answer.length()) answer = tmp;
                tmp = "";
            }
            else tmp += c;
        }
        answer = tmp.length() > answer.length() ? tmp : answer;

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
}
