package baekjoon.silver5;

public class Silver4673 {

    static boolean[] chk = new boolean[10001];
    static void dfs(int n) {

        int sum = n;
        while (n > 0) {

            sum += n % 10;
            n /= 10;
        }

        if (sum > 10000) return;
        if (chk[sum]) return;

        chk[sum] = true;

        dfs(sum);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {

            dfs(i);

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!chk[i]) sb.append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}
