package Brute_Force;

import java.io.*;
import java.util.StringTokenizer;

public class bj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] weight = new int[N];
        int[] height = new int[N];
        int[] cnt = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
            cnt[i] = 1;
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(j == i) {
                    continue;
                }

                if(weight[i] < weight[j] && height[i] < height[j]) {
                    cnt[i]++;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.print(cnt[i] + " ");
        }
    }
}
