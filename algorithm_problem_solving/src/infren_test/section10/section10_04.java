package infren_test.section10;

import java.util.*;

class Block2 implements Comparable<Block2>{
    int width;
    int height;
    int weight;

    public Block2(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Block2 o) {
        return o.width - this.width;
    }
}
public class section10_04 {
    static ArrayList<Block2> blocks;
    static int[] dy;
    static int solution(int n) {
        int answer = 0;
        Collections.sort(blocks);
        dy[0] = blocks.get(0).height;
        answer = dy[0];
        for (int i = 1; i < n; i++) {
            Block2 tmp1 = blocks.get(i);
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (tmp1.weight < blocks.get(j).weight && dy[j] > max) max = dy[j];
            }
            dy[i] = max + tmp1.height;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        blocks = new ArrayList<>();
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int we = sc.nextInt();
            blocks.add(new Block2(w, h, we));

        }
        System.out.println(solution(n));
    }
}
