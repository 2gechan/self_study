package baekjoon.bronze2;

import java.util.Scanner;

public class Bronze2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder(a + "");
        String rvsA = sb.reverse().toString();
        sb = new StringBuilder(b + "");
        String rvsB = sb.reverse().toString();
        int result = Math.max(Integer.valueOf(rvsA), Integer.valueOf(rvsB));
        System.out.println(result);

    }
}
