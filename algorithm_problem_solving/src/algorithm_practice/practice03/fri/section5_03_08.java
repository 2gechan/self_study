package algorithm_practice.practice03.fri;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    int emg;
    int num;

    public Patient(int emg, int num) {
        this.emg = emg;
        this.num = num;
    }
}
public class section5_03_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Patient> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Patient(sc.nextInt(), i));
        }

        int cnt = 0;
        while (true) {
            Patient now = q.poll();
            int len = q.size();
            boolean flag = true;
            for (int i = 0; i < len; i++) {
                Patient tmp = q.poll();
                if (now.emg < tmp.emg) flag = false;
                q.offer(tmp);
            }
            if (flag) {
                cnt++;
                if (now.num == m) break;
            } else q.offer(now);
        }
        System.out.println(cnt);

    }
}
