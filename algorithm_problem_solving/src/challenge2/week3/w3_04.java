package challenge2.week3;

import java.util.Scanner;

public class w3_04 {

    static int getMinTime(int a, int b, int c, int d) {
        int minTime = Integer.MAX_VALUE;

        minTime = Math.min(minTime, (a * 1000) + (b * 100) + (c * 10) + d);
        minTime = Math.min(minTime, (b * 1000) + (c * 100) + (d * 10) + a);
        minTime = Math.min(minTime, (c * 1000) + (d * 100) + (a * 10) + b);
        minTime = Math.min(minTime, (d * 1000) + (a * 100) + (b * 10) + c);

        return minTime;
    }

    static int getAllMinTime(int a, int b, int c, int d) {
        int answer = 0;

        int minTime = getMinTime(a, b, c, d);

        boolean[] allMinTime = new boolean[10000];

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < 10; l++) {
                        int tmp = getMinTime(i, j, k, l);

                        if (!allMinTime[tmp]) allMinTime[tmp] = true;
                    }
                }
            }
        }

        for (int i = 1111; i <= minTime; i++) {
            if (allMinTime[i]) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(getAllMinTime(a, b, c, d));
    }
}
