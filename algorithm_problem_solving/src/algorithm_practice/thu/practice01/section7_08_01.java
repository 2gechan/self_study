package algorithm_practice.thu.practice01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
송아지 찾기(BFS : 상태트리탐색)
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면
현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
송아지는 움직이지 않고 제자리에 있다.
현수는 스카이 콩콩을 타고 가는데
한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성 하세요.
 */
public class section7_08_01 {
    static int solution(int s, int e, int[] arr) {
        int answer = 0;
        int[] ch = new int[10001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        ch[s] = 1;
        int qSize = 0;
        while (!q.isEmpty()) {
            qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                int x = q.poll();
                int tmp = 0;
                for (int j = 0; j < arr.length; j++) {
                    tmp = x + arr[j];
                    if (tmp == e) return ++answer;
                    if (tmp >= 1 && tmp <= 10000 && ch[tmp] == 0) {
                        q.offer(tmp);
                        ch[tmp] = 1;
                    }
                }
            }
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int[] arr = {1, -1, 5};
        System.out.println(solution(s, e, arr));
    }
}
