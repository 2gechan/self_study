package algorithm_practice.fri.practice01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
응급실
메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.
이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.
• 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
• 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로
다시 넣습니다. 그렇지 않으면 진료를 받습니다.
즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
현재 N명의 환자가 대기목록에 있습니다.
N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료 를 받는지 출력하는 프로그램을 작성하세요.
대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.
 */

class Patient {
    int num;
    int emergency;

    public Patient(int num, int emergency) {
        this.num = num;
        this.emergency = emergency;
    }
}
public class section5_08_01 {

    static int solution(int[] arr, int m) {
        int answer = 0;
        Queue<Patient> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) q.offer(new Patient(i, arr[i]));

        while (!q.isEmpty()) {
            Patient patient = q.poll();
            int len = q.size();
            boolean flag = true;
            for (Patient p : q) {
                if (patient.emergency < p.emergency) {
                    q.offer(patient);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("나간 환자 : " + patient.emergency);
                answer++;
                if (patient.num == m) return answer;
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
        System.out.println(solution(arr, m));
    }
}
