package challenge.week4;

import java.util.Scanner;

public class w4_04 {
    static int[] arr;
    static int answer;

    static int find(int num) {
        if (arr[num] == num) return num;
        return find(arr[num]);
    }

    static void union(int x, int y) {
        int fx = find(x);
        int fy = find(y);

        if (fx == fy) answer++;
        else if (fx > fy) arr[fx] = fy;
        else arr[fy] = fx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {

            answer = 0;
            int n = sc.nextInt();
            arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }

            for (int i = 1; i <= n; i++) {
                int a = i;
                int b = sc.nextInt();
                union(a, b);
            }
            System.out.println(answer);
            T--;
        }
    }
}
