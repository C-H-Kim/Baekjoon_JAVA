package Brute_Force;

import java.io.*;
import java.util.StringTokenizer;

public class bj_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = blackjack(arr, N, M);

        System.out.println(result);
    }

    public static int blackjack(int[] arr, int N, int M) {
        int result = 0;

        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N -1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum == M) {
                        return sum;
                    }

                    if(result < sum && sum < M) {
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}