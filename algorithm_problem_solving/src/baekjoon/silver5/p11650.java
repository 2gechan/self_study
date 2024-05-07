package baekjoon.silver5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Position implements Comparable<Position> {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Position o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
public class p11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Position> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Position(x, y));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).x + " " + list.get(i).y);
        }
    }
}
