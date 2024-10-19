package challenge2.week2;

import java.util.*;


public class w2_06 {
    static int[] result;
    static boolean[] chk;
    static void solution(List<List<Integer>> list) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        chk[1] = true;
        while (!q.isEmpty()) {
            int parent = q.poll();
            for (int x : list.get(parent)) {

                if (chk[x]) continue;
                q.offer(x);
                result[x] = parent;
                chk[x] = true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chk = new boolean[n + 1];
        result = new int[n + 1];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 연결관계만 입력받기 때문에 누가 부모인지 알 수 없다
            list.get(a).add(b);
            list.get(b).add(a);
        }
        solution(list);
        for (int i = 2; i <= n; i++) {
            System.out.println(result[i]);
        }
    }
}
