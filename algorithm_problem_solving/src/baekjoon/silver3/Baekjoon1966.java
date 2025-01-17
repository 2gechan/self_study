package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


class Doc {
    int num;
    int priority;

    public Doc(int num, int priority) {
        this.num = num;
        this.priority = priority;
    }
}
public class Baekjoon1966 {

    static int solution(Doc[] docs, int M) {
        int answer = 0;

        Queue<Doc> queue = new LinkedList<>();

        for (Doc d : docs) {
            queue.offer(d);
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            Doc now = queue.poll();
            int len = queue.size();

            queue.offer(now);

            boolean flag = true;

            for (int i = 0; i < len; i++) {
                Doc tmp = queue.poll();
                queue.offer(tmp);
                if (now.priority < tmp.priority) {
                    flag = false;
                }
            }

            Doc last = queue.poll();
            if (flag) {
                cnt++;
                if (now.num == M) return cnt;
            }
            else {
                queue.offer(last);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {

            String[] NM = br.readLine().split(" ");
            int N = Integer.valueOf(NM[0]);
            int M = Integer.valueOf(NM[1]);

            Doc[] docs = new Doc[N];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                docs[i] = new Doc(i, Integer.valueOf(line[i]));
            }

            int answer = solution(docs, M);
            sb.append(answer + "\n");

        }

        System.out.println(sb.toString());

    }
}
