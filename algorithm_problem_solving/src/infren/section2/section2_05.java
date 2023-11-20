package infren.section2;

import java.util.Scanner;

public class section2_05 {
    static int count = 0;

    static void solution(int n) {

        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                count++;
                for (int j = i; j <= n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        solution(n);
        System.out.println(count);
    }
}
