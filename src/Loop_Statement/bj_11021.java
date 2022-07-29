package Loop_Statement;

import java.io.*;
import java.util.StringTokenizer;

public class bj_11021 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int iter = Integer.parseInt(br.readLine());

        for(int i = 0; i < iter; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write("Case #" + (i + 1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.close();
    }
}
