package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section1_12_02 {
    static String solution(int n, String line) {
        String answer = "";

        /*
        for (int i = 1; i <= n; i++) {
            int range = i * 7;
            int l = 1, sum = 0;
            for (int j = range - 1; j >= range - 7; j--) {
                char c = line.charAt(j);
                if (c == '#') {
                    sum += l;
                }
                l *= 2;
            }
            char c = (char) sum;
            answer += c;
        }
         */
        int[] tmp = {64, 32, 16, 8, 4, 2, 1};
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            int index = i % 7;
            if (line.charAt(i) == '#') sum += tmp[index];
            if (index == 6) {
                answer += (char) sum;
                sum = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 1. #은 1, *은 0
         * 2. 2진수를 10진수 변환
         * 3. 10진수의 아스키 번호를 문자로 변환
         * 4. 변환한 문자열 합쳐서 출력
         */

        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        System.out.println(solution(n, line));
    }
}
