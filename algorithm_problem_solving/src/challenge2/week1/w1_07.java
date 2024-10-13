package challenge2.week1;

import java.util.*;

public class w1_07 {


    static int solution(int N, Integer[] aType, Integer[] bType) {
        int answer = 0;
        Arrays.sort(aType, Collections.reverseOrder());
        Arrays.sort(bType, Collections.reverseOrder());
        int aTypeIndex = 0;
        int bTypeIndex = 0;
        if (N % 2 != 0) {
            answer += aType[aTypeIndex];
            aTypeIndex++;
            N--;
        }
        while (N > 0) {
            // 타일의 남은 면적을 짝수로 만든 후 while문에 진입 했기 때문에
            // 2 x 1 타일 한개로는 나머지 면적을 덮을 수 없다.
            if (aTypeIndex + 1 >= aType.length) {
                // 나머지 면적 2 x 2 타입 타일로 채우기
                while (N > 0 && bTypeIndex < bType.length) {
                    answer += bType[bTypeIndex];
                    bTypeIndex++;
                    N -= 2;
                }
                break;
            }
            // 사용할 수 있는 2 x 2 타일이 없는 경우
            if (bTypeIndex >= bType.length) {
                while (N > 0 && aTypeIndex < aType.length) {
                    answer += aType[aTypeIndex];
                    aTypeIndex++;
                    N -= 1;
                }
                break;
            }
            // 2 x 2 타일 한개보다 2 x 1 타일 두개의 예쁨의 정도가 높은 경우
            if (aType[aTypeIndex] + aType[aTypeIndex + 1] > bType[bTypeIndex]) {
                answer += aType[aTypeIndex] + aType[aTypeIndex + 1];
                aTypeIndex += 2;
            }
            else {
                answer += bType[bTypeIndex];
                bTypeIndex++;
            }
            N -= 2;

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 타일 면적 2 x N
        int A = sc.nextInt(); // 2 x 1 타일의 개수
        int B = sc.nextInt(); // 2 x 2 타일의 개수

        // 2 x 1 타입 타일
        Integer[] aType = new Integer[A];
        for (int i = 0; i < A; i++) {
            aType[i] = sc.nextInt();
        }
        // 2 x 2 타입 타일
        Integer[] bType = new Integer[B];
        for (int i = 0; i < B; i++) {
            bType[i] = sc.nextInt();
        }
        System.out.println(solution(N, aType, bType));
    }
}
