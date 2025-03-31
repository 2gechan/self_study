package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) sb.append(c);
        }
        System.out.println(Integer.valueOf(sb.toString()));
    }
}
