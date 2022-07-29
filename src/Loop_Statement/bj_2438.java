package Loop_Statement;

import java.io.*;

public class bj_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iter = Integer.parseInt(br.readLine());

        for(int i = 0; i < iter; i++) {
            for(int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
