package infren.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    int sTime;
    int eTime;

    public Meeting(int sTime, int eTime) {
        this.sTime = sTime;
        this.eTime = eTime;
    }

    @Override
    public int compareTo(Meeting o) {
        // this에서 o를 빼면 음수라는 의미로 오름차순
        // 반대는 내림차순
        if (this.eTime == o.eTime) return this.sTime - o.sTime;
        else return this.eTime - o.eTime;
    }
}
// 회의 시간이 겹치지 않게 최대 희의실을 사용할 수 있는 회의실 수 구하기
public class section9_02 {

    static int solution(ArrayList<Meeting> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Meeting ob : arr) {
            if (ob.sTime >= et) {
                cnt++;
                et = ob.eTime;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Meeting(s, e));
        }
        System.out.println(solution(arr, n));
    }
}
