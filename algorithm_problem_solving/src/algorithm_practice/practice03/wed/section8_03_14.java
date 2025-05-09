package algorithm_practice.practice03.wed;

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

public class section8_03_14 {
    static int n, m, answer = Integer.MAX_VALUE;
    static int[] select;
    static int[][] arr;
    static List<Info> pizza, home;


    static void solution(int l, int index) {

        if (l == m) {
            int sum = 0;
            for (Info h : home) {
                int min = Integer.MAX_VALUE;
                for (int i : select) {
                    Info p = pizza.get(i);
                    min = Math.min(min, Math.abs(p.x - h.x) + Math.abs(p.y - h.y));
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

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][n];
        select = new int[m];
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) home.add(new Info(i, j));
                if (arr[i][j] == 2) pizza.add(new Info(i, j));
            }
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
