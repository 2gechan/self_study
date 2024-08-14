package challenge.week2;

import java.util.Scanner;

public class w2_03 {

    static int solution1(int n, String[] seat) {
        int answer = 0;

        int coupleSeatCount = 0;
        for (String s : seat) {
            if (s.equals("L")) coupleSeatCount++;
        }

        // 커플 석이 하나도 없을 경우 모든 사람이 컵홀더 사용 가능
        if (coupleSeatCount == 0) return n;

        // (커플석 쌍의 수 - 1)명 만큼의 사람이 컵홀더 사용 불가
        coupleSeatCount = (coupleSeatCount / 2) - 1;
        answer = n - coupleSeatCount;

        return answer;
    }

    static int solution2(int n, String[] seat) {
        int answer = 0;
        int[] cupHolders = new int[n + 1];

        boolean coupleChk = true; // 커플석 시작, 끝을 체크할 변수
        for (int i = 0; i < n; i++) {
            if (seat[i].equals("S")) {
                if (cupHolders[i] == 0) {
                    // 일반 좌석 왼쪽 컵홀더 사용
                    cupHolders[i] = 1;
                }
                else {
                    // 일반 좌석 오른쪽 컵홀더 사용
                    cupHolders[i + 1] = 1;
                }
            }
            else {
                // 커플석 왼쪽 좌석
                if (coupleChk) {
                    // 커플석 왼쪽 좌석은 왼쪽만 사용 가능
                    if (cupHolders[i] == 0) cupHolders[i] = 1;
                    coupleChk = false;
                }
                // 커플석 오른쪽 좌석
                else {
                    cupHolders[i + 1] = 1;
                    coupleChk = true;
                }
            }
        }

        for (int x : cupHolders) {
            if (x == 1) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 공백 제거
        String[] seat = sc.nextLine().split("");
        System.out.println(solution2(n, seat));

    }
}
