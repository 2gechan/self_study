package baekjoon.Bronze3;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.BigInteger;
//import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 틀린문제
// 소수끼리의 곱한 값 p는 결국 소수끼리 곱해지기 때문에
// 첫번째 소수만 구하면된다. 굳이 p 값 미만의 모든 소수를 구할 필요 없음
// p 값으로 나눠지는 첫번째 소수만 구하면 끝
// 시간초과로 틀린 답
public class Bronze3_1703 {

    // 가져온 정답
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger P = new BigInteger(st.nextToken());
        BigInteger K = new BigInteger(st.nextToken());
        //계속 1씩 증가해줄 변수 선언
        BigInteger i = new BigInteger("1");

        //몇번 반복할지 정할 수 없기에 무한루프
        while (true) {
            //i가 K보다 크거나 같아지면 GOOD 출력 그리고 반복문 종료
            if (i.compareTo(K) == 1 || i.compareTo(K) == 0) {
                System.out.println("GOOD");
                break;
            }
            //한번 반복 될때마다 i에 1더한다.
            i = i.add(BigInteger.ONE);

            //P가 i로 나눠지고, i가 K보다 작으면 BAD와 i값을 출력. 반복문 종료
            if (P.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(K) == -1) {
                System.out.println("BAD " + i);
                break;
            }
        }

    }

}

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] testCase = br.readLine().split(" ");
//        BigInteger p = new BigInteger(testCase[0]);
//        BigInteger k = new BigInteger(testCase[1]);
//        prime(p, k);
//
//    }
//
//    private static void prime(BigInteger p, BigInteger k) {
//        // BigInteger 타입의 i의 기본 값을 2로 설정하고
//        // i와 p의 값을 비교하여 i가 작으면 -1, 같으면 같으면 0, 크면 +1 리턴
//        // i.add(BigInteger.ONE) 1씩 증가시키고 i에 다시 대입해줘야한다.
//        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(p) <= 0; i = i.add(BigInteger.ONE)) {
//            if (p.remainder(i).compareTo(BigInteger.ZERO) == 0) {
//                if (i.compareTo(k) < 0) {
//                    System.out.println("BAD " + i);
//                    return;
//                } else {
//                    System.out.println("GOOD");
//                    return;
//                }
//            }
//        }
//    }
