package algorithm_practice.fri.practice02;

import java.util.*;

class Patient {
    int num;
    int emg;

    public Patient(int num, int emg) {
        this.num = num;
        this.emg = emg;
    }
}
// 응급실
public class section5_08_02 {

    static int solution(List<Patient> list, int m) {
        int answer = 1;

        Queue<Patient> q = new LinkedList<>();
        for (Patient p : list) {
            q.offer(p);
        }
        while (!q.isEmpty()) {
            Patient tmp = q.poll();

            for (Patient p : q) {
                if (tmp.emg < p.emg) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                if (tmp.num == m) return answer;
                else answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Patient> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int emg = sc.nextInt();
            list.add(new Patient(i, emg));
        }
        System.out.println(solution(list, m));
    }
}
