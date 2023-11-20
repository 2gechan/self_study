package infren.section2;

import java.util.Scanner;

public class section2_06 {
    static String solution(int n, String[] tc) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String t = String.valueOf(new StringBuilder(tc[i]).reverse());

            int num = Integer.parseInt(t);
            if(num == 1) continue;
            int ch = 0;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    ch++;
                    break;
                }
            }
            if (ch == 0) {
                answer += num + " ";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] tc = sc.nextLine().split(" ");
        String answer = solution(n, tc);
        System.out.println(answer);
    }
}
