package algorithm_practice.practice03.mon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

public class section10_03_04 {
    static int solution(List<Block> list) {
        int answer = 0;

        int[] dy = new int[list.size()];

        Collections.sort(list);
        dy[0] = list.get(0).height;

        for (int i = 1; i < list.size(); i++) {
            Block now = list.get(i);

            int max = 0;
            for (int j = i - 1; j >= 0; j--) {

                if (now.weight < list.get(j).weight && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + now.height;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
