package infren.section3;

import java.util.*;

public class section3_02 {
    static List<Integer> solution(int[] t1, int n, int[] t2, int m) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(t1);
        Arrays.sort(t2);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (t1[p1] == t2[p2]) {
                list.add(t1[p1]);
                p1++;
                p2++;
            } else if(t1[p1] < t2[p2]){
                p1++;
            } else if (t1[p1] > t2[p2]) {
                p2++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t1 = new int[n];
        for (int i = 0; i < n; i++) {
            t1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] t2 = new int[m];
        for (int i = 0; i < m; i++) {
            t2[i] = sc.nextInt();
        }
        for(int x : solution(t1, n, t2, m)) System.out.print(x + " ");
    }
}
