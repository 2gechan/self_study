package infren.section6;

import java.util.*;

// Comparable을 이용한 좌표값 정렬 알고리즘
class Point implements Comparable<Point> {

    public int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // compareTo 내림차순은 음수가 나오게 오름차순은 양수가 나오게
    // this 에서 o를 빼면 음수
    // o에서 this를 빼면 양수
    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
public class section6_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> t = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            t.add(new Point(x, y));
        }
        // Comparable을 구현한 클래스의 compareTo 정렬 조건에 의해서 정렬된다.
        Collections.sort(t);
        for (Point o : t) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
