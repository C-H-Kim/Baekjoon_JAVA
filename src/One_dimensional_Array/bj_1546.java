package One_dimensional_Array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max, N;
        double sum = 0;

        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        max = Arrays.stream(arr).max().getAsInt();

        for(int i = 0; i < N; i++) {
            sum += ((double) arr[i] / max * 100);
        }

        System.out.println(sum / N);
    }
}
