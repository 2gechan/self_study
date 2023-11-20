package baekjoon.Bronze3;

import java.util.Scanner;

public class Bronze3_1085 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] testCase = scan.nextLine().split(" ");

        int x = Integer.parseInt(testCase[0]);
        int y = Integer.parseInt(testCase[1]);
        int w = Integer.parseInt(testCase[2]);
        int h = Integer.parseInt(testCase[3]);

        int resultX = 0;
        int resultY = 0;
        if (x > (w - x)) {
            resultX = w-x;
        } else {
            resultX = x;
        }
        if (y > (h - y)) {
            resultY = h-y;
        } else {
            resultY = y;
        }

        if (resultX > resultY) {
            System.out.println(resultY);
        } else {
            System.out.println(resultX);
        }
    }
}
