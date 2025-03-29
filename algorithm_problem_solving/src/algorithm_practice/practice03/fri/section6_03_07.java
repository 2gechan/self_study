package algorithm_practice.practice03.fri;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class section6_03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[][] point = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            point[i][0] = x;
            point[i][1] = y;
        }
        Arrays.sort(point, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });

        for (Integer[] p : point) {
            System.out.println(p[0] + " " + p[1]);
        }
    }
}
