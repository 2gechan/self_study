package algorithm_practice01.wed.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
피자 배달 거리(삼성 SW역량평가 기출문제 : DFS활용)
N×N 크기의 도시지도가 있습니다. 도시지도는 1×1크기의 격자칸으로 이루어져 있습니다.
각 격자칸에는 0은 빈칸, 1은 집, 2는 피자집으로 표현됩니다.
각 격자칸은 좌표(행번호, 열 번호)로 표현됩니다.
행번호는 1번부터 N번까지이고, 열 번호도 1부터 N까지입니다.
도시에는 각 집마다 “피자배달거리”가 았는데 각 집의 피자배달거리는
해당 집과 도시의 존재 하는 피자집들과의 거리 중 최소값을 해당 집의 “피자배달거리”라고 한다.
집과 피자집의 피자배달거리는 |x1-x2|+|y1-y2| 이다.
예를 들어, 도시의 지도가 아래와 같다면
0 1 0 0
0 0 2 1
0 0 1 0
1 2 0 2
(1, 2)에 있는 집과 (2, 3)에 있는 피자집과의 피자 배달 거리는
|1-2| + |2-3| = 2가 된다.
최근 도시가 불경기에 접어들어 우후죽순 생겼던 피자집들이 파산하고 있습니다.
도시 시장은 도시에 있는 피자집 중 M개만 살리고 나머지는 보조금을 주고 폐업시키려고 합니다.
시장은 살리고자 하는 피자집 M개를 선택하는 기준으로 도시의 피자배달거리가 최소가 되는 M개의 피자집을 선택하려고 합니다.
도시의 피자 배달 거리는 각 집들의 피자 배달 거리를 합한 것을 말합니다.
 */
public class section8_14_01 {

    static int[] combi;
    static int answer = Integer.MAX_VALUE, n, m;
    static List<Point> home, pizza;
    static void solution(int l, int index) {
        if (l == m) {
            int sum = 0;
            for (Point h : home) {
                int min = Integer.MAX_VALUE; // h 집에 가는데 가장 가까운 피자집 거리
                for (int listIndex : combi) {
                    min = Math.min(min, Math.abs(pizza.get(listIndex).x - h.x)
                            + Math.abs(pizza.get(listIndex).y - h.y));
                }
                sum += min;
            }
            answer = Math.min(answer, sum);
        }
        else {
            for (int i = index; i < pizza.size(); i++) {
                combi[l] = i;
                solution(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        combi = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int p = sc.nextInt();
                if (p == 1) home.add(new Point(i, j));
                else if (p == 2) pizza.add(new Point(i, j));
            }
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
