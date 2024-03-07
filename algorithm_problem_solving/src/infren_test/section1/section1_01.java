package infren_test.section1;

import java.util.Scanner;

public class section1_01 {
    static int solution(String tc, char t) {
        int answer = 0;

        for (int i = 0; i < tc.length(); i++) {
            char c = tc.charAt(i);
            if (c == t) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        tc = tc.toLowerCase();
        String c = sc.nextLine();

        char t = c.toLowerCase().charAt(0);
        System.out.println(solution(tc, t));
    }
}
