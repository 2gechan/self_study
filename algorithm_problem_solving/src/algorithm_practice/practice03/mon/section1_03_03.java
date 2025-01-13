package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_03 {

    static String solution(String line) {
        String answer = "";
        String[] split = line.split(" ");

        for (String x : split) {
            if (answer.length() < x.length()) {
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
}
