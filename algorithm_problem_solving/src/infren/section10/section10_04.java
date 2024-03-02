package infren.section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Block implements Comparable<Block>{
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

// 크기, 무게를 고려한 가장 높은탑 쌓기, 최대부분증가수열과 비슷
public class section10_04 {
    static int[] dy;
    static int solution(ArrayList<Block> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).height;
        answer = dy[0];
        for (int i = 1; i < arr.size(); i ++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).weight > arr.get(i).weight && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Block> arr = new ArrayList<>();
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Block(a, b, c));
        }
        System.out.println(solution(arr));
    }
}
