package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(line.charAt(0));

        int cnt = 1;
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(i - 1)) {
                cnt++;
            }
            else {
                if (cnt > 1) sb.append(cnt);
                sb.append(line.charAt(i));
                cnt = 1;
            }
        }
        if (cnt > 1) sb.append(cnt);
        System.out.println(sb.toString());
    }
}
