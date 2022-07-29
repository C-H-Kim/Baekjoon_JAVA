package Loop_Statement;

import java.io.*;

public class bj_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iter = Integer.parseInt(br.readLine());

        for(int i = 0; i < iter; i++) {
            for(int j = i; j < iter - 1; j++)
                bw.write(" ");
            for(int j = 0; j <= i; j++)
                bw.write("*");
            bw.write("\n");
        }
        bw.close();
    }
}
