package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1543 {

    static void solution(int i) {
        if (wIndex == wordLen) flag = true;
        else {
            if (docs[i] == words[wIndex]) {
                wIndex++;
                solution(i + 1);
            }
        }

    }
    static char[] docs, words;
    static int wIndex, wordLen;
    static boolean flag = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();
        docs = doc.toCharArray();
        words = word.toCharArray();
        int index = 0;
        wIndex = 0;
        wordLen = words.length;
        int result = 0;
        while (docs.length - index >= words.length) {
            solution(index);
            if (flag) {
                flag = false;
                index += wordLen - 1;
                result++;
            }
            index++;
            wIndex = 0;
        }
        System.out.println(result);

    }
}
