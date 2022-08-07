package IO_ArithmeticOperation;

import java.io.*;
import java.util.StringTokenizer;

public class bj_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] piece = {1, 1, 2, 2, 2, 8};

        for(int n : piece) {
            bw.write(n - Integer.parseInt(st.nextToken()) + " ");
        }
        bw.close();
    }
}
