package Brute_Force;

import java.io.*;
import java.util.StringTokenizer;

public class bj_1018 {
    static boolean[][] arr;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            for(int j = 0; j < M; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
                else {
                    arr[i][j] = false;
                }
            }
        }

        int row = N - 7;
        int col = M - 7;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int row_end = x + 8;
        int col_end = y + 8;

        boolean TF = arr[x][y];
        int count = 0;

        for(int i = x; i < row_end; i++) {
            for(int j = y; j < col_end; j++) {
                if(arr[i][j] != TF) {
                    count++;
                }

                TF = !TF;
            }
            TF = !TF;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
