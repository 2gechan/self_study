package algorithm_practice.thu.practice02;

import java.util.Scanner;

// 친구인가?
public class section9_06_02 {
    static int[] arr;
    static int find(int num) {
        if (arr[num] == num) return num;
        else return arr[num] = find(arr[num]);
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
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        if (find(a1) == find(b1)) System.out.println("YES");
        else System.out.println("NO");
    }

}
