package infren.section2;

import java.util.Scanner;

public class section2_07 {
    static int solution(String[] tc) {
        int sum = 0;
        int score = 1;
        for (int i = 0; i < tc.length; i++) {
            if (Integer.parseInt(tc[i]) == 1) {
                sum += score;
                score++;
            } else {
                score = 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] tc = sc.nextLine().split(" ");
        System.out.println(solution(tc));
    }
}
