package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int prev_sum = 0;
        int cross = 1;
        while (true) {

            // x - sum : x번째의 대각선에 몇번째인지 ex) x가 4일 경우 sum = 3이고, x는 3번째 대각선에 1번째
            // 하지만 감소하는 케이스는 대각선의 최대 수 -> 최소 수 로 진행되기 때문에
            // 대각선에 분모 또는 분자에 들어갈 수 있는 최대 수는 대각선의 분자 개수 이다.
            // 고로 (분자 개수 - (x - prev_sum - 1))을 해줘야 한다. -1을 추가하는 이유는 분모 또는 분자는 1부터 시작하기때문에

            if (x <= prev_sum + cross) {

                if (cross % 2 == 1) {
                    // 밑에서 위로
                    System.out.println((cross - (x - prev_sum - 1)) + "/" + (x - prev_sum));
                    break;
                }
                else {

                    System.out.println((x - prev_sum) + "/" + (cross - (x - prev_sum - 1)));
                    break;
                    // 위에서 밑으로 

                }
            }

            prev_sum += cross;
            cross++;
        }
    }
}
