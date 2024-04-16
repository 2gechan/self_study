package infren_test.section6;

import java.lang.reflect.Array;
import java.util.*;

class Position implements Comparable<Position> {

    int x;
    int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Position o) {
        if (this.x != o.x) return this.x - o.x;
        else return this.y - o.y;
    }

}
public class section6_07 {
    static List<Position> solution(List<Position> arr) {
        Collections.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Position> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Position(x, y));
        }
        for (Position p : solution(arr)) System.out.println(p.x + " " + p.y);
    }
}
