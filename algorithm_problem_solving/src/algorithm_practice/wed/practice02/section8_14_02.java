package algorithm_practice.wed.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Info {
    int x;
    int y;

    public Info(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 피자 배달 거리
public class section8_14_02 {

    static int m, answer = Integer.MAX_VALUE;
    static List<Info> pizza, home;
    static int[] select;
    static void solution(int l, int index) {
        if (l == m) {
            int sum = 0;
            for (Info h : home) {
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < m; i++) {
                    Info p = pizza.get(select[i]);
                    min = Math.min(min, Math.abs(h.x - p.x) + Math.abs(h.y - p.y));
                }
                sum += min;
            }
            answer = Math.min(answer, sum);
        }
        else {
            for (int i = index; i < pizza.size(); i++) {
                select[l] = i;
                solution(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        pizza = new ArrayList<>();
        home = new ArrayList<>();
        select = new int[m];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int info = sc.nextInt();

                if (info == 1) home.add(new Info(i, j));
                if (info == 2) pizza.add(new Info(i, j));
            }
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
