package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section9_03_06 {

    static int[] arr;
    static int find(int a) {
        if (arr[a] == a) return a;
        else return arr[a] = find(arr[a]);
    }

    static void union(int a, int b) {
        int a1 = find(a);
        int b1 = find(b);

        if (a1 != b1) arr[a1] = b1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        int st1 = sc.nextInt();
        int st2 = sc.nextInt();
        int a1 = find(st1);
        int a2 = find(st2);
        if (a1 == a2) System.out.println("YES");
        else System.out.println("NO");
    }
}
