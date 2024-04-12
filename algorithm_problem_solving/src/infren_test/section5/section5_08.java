package infren_test.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Section5_08_person {
    int id;
    int priority;

    public Section5_08_person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class section5_08 {
    static int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Section5_08_person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) q.offer(new Section5_08_person(i, arr[i]));
        while (!q.isEmpty()) {
            Section5_08_person tmp = q.poll();
            boolean flag = true;
            for (Section5_08_person x : q) {
                if (x.priority > tmp.priority) {
                    q.offer(tmp);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (tmp.id == m) break;
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
