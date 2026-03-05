package baekjoon.bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        int count = new StringTokenizer(line).countTokens();
        System.out.println(count);
    }
}
