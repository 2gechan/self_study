package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d2_1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        long[] resultArr = new long[testCount];

        for (int i = 0; i < testCount; i++) {
            int day = Integer.parseInt(br.readLine());
            long benefit = 0;
            String[] str_price_of_day = br.readLine().split(" ");

            int max_price = 0;
            int max_price_index = 0;

            for (int j = 0; j < day; j++) {
                if (max_price < Integer.parseInt(str_price_of_day[j])) {
                    max_price = Integer.parseInt(str_price_of_day[j]);
                    max_price_index = j;
                }
            }

            for (int z = 0; z < day; z++) {
                int testCase = Integer.parseInt(str_price_of_day[z]);
                if (z > max_price_index) {
                    max_price = 0;
                    max_price_index = 0;
                    for (int x = z; x < day; x++) {
                        if (max_price < Integer.parseInt(str_price_of_day[x])) {
                            max_price = Integer.parseInt(str_price_of_day[x]);
                            max_price_index = x;
                        }
                    }
                }
                if (testCase < max_price) {
                    benefit += max_price - testCase;
                }
            }
            resultArr[i] = benefit;

        }
        for (int result=0; result < resultArr.length; result++) {
            System.out.printf("#%d %d\n", result + 1, resultArr[result]);
        }

    }
}
