package Loop_Statement;

import java.io.*;

public class bj_2742 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());

        for(int i = iter; i > 0; i--) {
            bw.write(i + "\n");
        }
        bw.close();
    }
}
