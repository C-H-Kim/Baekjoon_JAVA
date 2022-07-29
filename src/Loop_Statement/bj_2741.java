package Loop_Statement;

import java.io.*;

public class bj_2741 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());

        for(int i = 0; i < iter; i++) {
            bw.write((i + 1) + "\n");
        }
        bw.close();
    }
}
