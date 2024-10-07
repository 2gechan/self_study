package challenge2.week1;

import java.util.Scanner;

public class w1_01 {
    static int H, W, N, answer = 0;
    static int[][] stickers;

    static void solution() {

        for (int i = 0; i < N; i++) {
            int h = stickers[i][0];
            int w = stickers[i][1];
            int size = stickers[i][2];
            // 스티커를 그대롤 붙힐 경우
            if (h <= H && w <= W) {
                chk(i + 1, H - h, W - w, size);
            }
            // 스티커를 돌려서 붙힐 경우
            if (h <= W && w <= H) {
                chk(i + 1, H - w, W - h, size);
            }
        }
    }

    /**
     * 첫번째 스티커를 붙히고 다음에 붙힐 수 있는 스티커 탐색하는 method
     * @param index 다음에 붙힐 스티커 번호
     * @param h 이전 스티커를 붙히고 남은 세로 길이
     * @param w 이전 스티커를 붙히고 남은 가로 길이
     * @param size 이전에 붙힌 스티커 사이즈
     */
    static void chk(int index, int h, int w, int size) {

        for (int i = index; i < N; i++) {
            int currentH = stickers[i][0];
            int currentW = stickers[i][1];
            int currentSize = stickers[i][2];
            if ((currentH <= h && currentW <= W) || (currentH <= H && currentW <= w)
                || (currentH <= w && currentW <= H) || (currentH <= W && currentW <= h)) {
                answer = Math.max(answer, size + currentSize);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt(); // 세로
        W = sc.nextInt(); // 가로
        N = sc.nextInt(); // 스티커 개수
        stickers = new int[N][3];
        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int size = h * w;
            stickers[i][0] = h;
            stickers[i][1] = w;
            stickers[i][2] = size;
        }
        solution();
        System.out.println(answer);
    }
}
