package infren_test.section1;

import java.util.Scanner;

public class section1_12 {
    static String solution(int n, String tc) {
        String answer = "";
        tc = tc + " ";
        int[] sample = {64, 32, 16, 8, 4, 2, 1};
        int index = 0;
        int sum = 0;
        for (int i = 0; i < tc.length(); i++) {
            char c = tc.charAt(i) == '#' ? '1' : '0';
            if (i != 0 && i % 7 == 0) {
                char r = (char) sum;
                answer += r;
                index = 0;
                sum = 0;
            }
            if (c == '1') sum += sample[index];
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String tc = sc.nextLine();
        System.out.println(solution(n, tc));
    }
}
