package Loop_Statement;

import java.io.*;
import java.util.StringTokenizer;

public class bj_11022 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num1, num2;
        int iter = Integer.parseInt(br.readLine());

        for(int i = 0; i < iter; i++) {
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i + 1) + ": " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
        }
        bw.close();
    }
}
