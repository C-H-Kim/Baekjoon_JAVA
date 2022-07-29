package One_dimensional_Array;

import java.io.*;
import java.util.StringTokenizer;

public class bj_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N, min = 1000001, max = -1000001, val;

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            val = Integer.parseInt(st.nextToken());
            if(val > max)
                max = val;
            if(val < min)
                min = val;
        }
        bw.write(min + " " + max);
        bw.close();
    }
}
