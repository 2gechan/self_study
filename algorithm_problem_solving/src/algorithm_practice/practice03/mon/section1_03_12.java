package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        int[] example = {64, 32, 16, 8, 4, 2, 1};

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < n; i++) {
            int ascii = 0;
            for (int j = 0; j < 7; j++) {
                if (line.charAt(index++) == '#') {
                    ascii += example[j];
                }
            }
            char c = (char) ascii;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
