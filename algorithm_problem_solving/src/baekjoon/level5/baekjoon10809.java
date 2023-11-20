package baekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 소문자로만 이루어진 단어 S가 주어진다.
// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
public class baekjoon10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] testCase = br.readLine().split("");
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] alphabetIndex = new int[26];
        for (int i = 0; i < alphabetIndex.length; i++) {
            alphabetIndex[i] = -1;
        }
        for (int i = 0; i < testCase.length; i++) {
            // System.out.println(testCase[i]);

            for (int j = 0; j < alphabet.length; j++) {
                if(testCase[i].equals(alphabet[j])) {
                    if(alphabetIndex[j] != -1) {
                        break;
                    } else {
                        alphabetIndex[j] = i;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < alphabetIndex.length; i++) {
            System.out.print(alphabetIndex[i] + " ");
        }
    }
}
