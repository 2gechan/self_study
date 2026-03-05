package baekjoon.bronze2;

import java.util.Scanner;

public class Bronze8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String line = sc.nextLine();
            int score = 0;
            int cost = 1;
            for (char c : line.toCharArray()) {
                if (c == 'O') score += cost;
                else cost = 0;
                cost++;
            }
            sb.append(score).append("\n");
        }
        System.out.println(sb.toString());
    }
}
