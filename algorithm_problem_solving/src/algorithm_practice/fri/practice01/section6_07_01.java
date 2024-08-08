package algorithm_practice.fri.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
좌표 정렬
N개의 평면상의 좌표(x, y)가 주어지면
모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
 */

class Position implements Comparable<Position> {
    int x;
    int y;

    @Override
    public int compareTo(Position o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class section6_07_01 {

    static List<Position> solution(List<Position> list) {
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Position> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Position(x, y));
        }
        for (Position p : solution(list)) System.out.println(p.x + " " + p.y);
    }
}
