package One_dimensional_Array;

import java.io.*;
import java.util.StringTokenizer;

public class bj_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int test_case = Integer.parseInt(br.readLine());

        for(int i = 0; i < test_case; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            int sum = 0, cnt = 0;

            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            for(int j = 0; j < N; j++) {
                if((sum / N) < arr[j]) {
                    cnt++;
                }
            }
            String s = String.format("%.3f%%", (double)cnt / N * 100);
            bw.write(s + "\n");
        }
        bw.close();
    }
}
