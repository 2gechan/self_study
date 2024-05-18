package infren_test.section9;

import java.util.Scanner;

public class section9_06 {
    static int[] arr;

    static int find(int v) {
        if (v == arr[v]) return v;
        else return arr[v] = find(arr[v]); // 경로 압출을 위해 배열에 대입해준 후 리턴
    }
    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) arr[fa] = fb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = i;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = find(a);
        int fb = find(b);
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
