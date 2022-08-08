package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11729 {

    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int N, int from, int by, int to) {
        if(N == 0)
            return;

        hanoi(N - 1, from, to, by);
        sb.append(from + " " + to + "\n");
        hanoi(N - 1, by, from, to);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb.append((int)Math.pow(2, N) - 1).append("\n");

        hanoi(N, 1, 2, 3);
        System.out.print(sb);
    }

}
