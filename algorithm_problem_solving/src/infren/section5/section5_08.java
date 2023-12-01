package infren.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

// n명의 환자들중 위험도 순으로 치료를 받아야한다.
// 들어온 순서대로 m번째 환자는 몇번째에 치료를 받을 수 있는지 구하는 알고리즘
public class section5_08 {
    static int solution(int[] t, int n, int m) {
        Queue<Person> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < n; i++) q.offer(new Person(i, t[i]));
        while (!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person x : q) {
                if (tmp.priority < x.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                count++;
                if (tmp.id == m) return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        solution(t, n, m);
    }
}
