package infren.section2;

import java.util.Scanner;

public class section7_08 {

    static String solution(String[] tc) {

        String answer = "";
        for (int i = 0; i < tc.length; i++) {
            int count = 1;
            int score = Integer.parseInt(tc[i]);
            for (int j = 0; j < tc.length; j++) {
                if (score < Integer.parseInt(tc[j])) {
                    count++;
                }
            }
            answer += count + " ";

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] tc = sc.nextLine().split(" ");
        System.out.println(solution(tc));
    }
}
