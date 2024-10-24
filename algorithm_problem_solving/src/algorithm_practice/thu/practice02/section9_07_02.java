package algorithm_practice.thu.practice02;

import java.util.*;

class Wonderland implements Comparable<Wonderland> {
    int start;
    int end;
    int cost;

    public Wonderland(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Wonderland o) {
        return this.cost - o.cost;
    }
}
// 원더랜드(union&find)
public class section9_07_02 {
/*
9 12
1 2 12
1 9 25
2 3 10
2 8 17
2 9 8
3 4 18
3 7 55
4 5 44
5 6 60
5 7 38
7 8 35
8 9 15
 */
    static int[] ch;
    static int answer = 0;
    static int find(int a) {
        if (ch[a] == a) return a;
        else return ch[a] = find(ch[a]);
    }
    static boolean union(int a, int b) {
        boolean flag = false;
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            ch[fa] = fb;
            flag = true;
        }
        return flag;
    }

    static void solution(List<Wonderland> list) {

        Collections.sort(list);
        for (Wonderland w : list) {
            if (union(w.start, w.end)) answer += w.cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ch = new int[v + 1];
        for (int i = 1; i <= v; i++) {
            ch[i] = i;
        }
        List<Wonderland> list = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(new Wonderland(a, b, c));
        }
        solution(list);
        System.out.println(answer);
    }
}
