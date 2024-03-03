package infren.section10;

import java.util.Scanner;

// 제한시간안에 풀 수 있는 최대 점수 구하기, 냅색 알고리즘
// 냅색 알고리즘을 사용할 때 종류가 무한대이면 이중 포문을 앞에서 뒤로, 제한되면 뒤에서 앞으로
public class section10_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int ps = sc.nextInt();
            int pt = sc.nextInt();
            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }
        System.out.println(dy[m]);
    }
}
