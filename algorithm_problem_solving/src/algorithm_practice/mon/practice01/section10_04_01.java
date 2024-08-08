package algorithm_practice.mon.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
가장 높은 탑 쌓기
밑면이 정사각형인 직육면체 벽돌들을 사용하여 탑을 쌓고자 한다.
탑은 벽돌을 한 개씩 아래 에서 위로 쌓으면서 만들어 간다. 아래의 조건을 만족하면서 가장 높은 탑을 쌓을 수 있는 프로그램을 작성
(조건1) 벽돌은 회전시킬 수 없다. 즉, 옆면을 밑면으로 사용할 수 없다.
(조건2) 밑면의 넓이가 같은 벽돌은 없으며, 또한 무게가 같은 벽돌도 없다.
(조건3) 벽돌들의 높이는 같을 수도 있다.
(조건4) 탑을 쌓을 때 밑면이 좁은 벽돌 위에 밑면이 넓은 벽돌은 놓을 수 없다.
(조건5) 무게가 무거운 벽돌을 무게가 가벼운 벽돌 위에 놓을 수 없다.
 */
class Block implements Comparable<Block> {
    int width;
    int height;
    int weight;

    public Block(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Block o) {
        return o.width - this.width;
    }
}
public class section10_04_01 {
    static int[] dy;
    static int solution(List<Block> list) {
        Collections.sort(list);
        dy[0] = list.get(0).height;
        int answer = dy[0];
        for (int i = 1; i < list.size(); i++) {
            Block tmp = list.get(i);
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (tmp.weight < list.get(j).weight && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + tmp.height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n];
        List<Block> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Block(width, height, weight));
        }
        System.out.println(solution(list));
    }
}
