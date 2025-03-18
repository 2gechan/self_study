package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.toLowerCase();
        StringBuilder sb = new StringBuilder(line);
        String rvs = sb.reverse().toString();

        String answer = "YES";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != rvs.charAt(i)) answer = "NO";
        }
        System.out.println(answer);
    }
}
