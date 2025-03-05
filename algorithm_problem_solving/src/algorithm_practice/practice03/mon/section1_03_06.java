package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (line.indexOf(c) == i) sb.append(c);
        }
        System.out.println(sb.toString());

    }
}
