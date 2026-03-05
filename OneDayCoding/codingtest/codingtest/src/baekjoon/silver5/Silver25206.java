package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum1 = 0; // 수강한 수업들의 총 학점
        double sum2 = 0; // 수강한 수업들의 받은 학점
        for (int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");

            if (arr[2].equals("P")) {
                continue;
            }
            sum1 += Double.parseDouble(arr[1]);

            double tmp = 0.0;
            switch (arr[2]) {
                case "A+" :
                    tmp = 4.5;
                    break;
                case "A0" :
                    tmp += 4.0;
                    break;
                case "B+" :
                    tmp += 3.5;
                    break;
                case "B0" :
                    tmp += 3.0;
                    break;
                case "C+" :
                    tmp += 2.5;
                    break;
                case "C0" :
                    tmp += 2.0;
                    break;
                case "D+" :
                    tmp += 1.5;
                    break;
                case "D0" :
                    tmp += 1.0;
                    break;
                case "F" :
                    tmp += 0.0;
                    break;
            }

            sum2 += Double.parseDouble(arr[1]) * tmp;
        }

        System.out.printf("%.4f", sum2 / sum1);
    }
}
