package algorithm_practice.fri.practice02;

import java.util.*;

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
public class section10_04_02 {
    static int[] dy;
    static int solution(List<Block> list) {
        int answer = 0;

        Collections.sort(list);

        dy[0] = list.get(0).height;
        answer = dy[0];

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
