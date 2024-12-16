package algorithm_practice.mon.practice03.mon;

import java.util.Scanner;

public class section1_03_01 {
    static int solution(String line, String findStr) {
        int answer = 0;
        char findChar = findStr.charAt(0);
        line = line.toLowerCase();

        for (char c : line.toCharArray()) {
            if (c == findChar) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String findStr = sc.nextLine();
        System.out.println(solution(line, findStr));
    }

}
