package Loop_Statement;

import java.io.*;

public class bj_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N, N_tens, N_units, P_units;
        int count = 0;
        int new_num;

        N = Integer.parseInt(br.readLine());
        new_num = N;

        do{
            N_tens = new_num / 10;
            N_units = new_num % 10;
            P_units = (N_tens + N_units) % 10;
            new_num = N_units * 10 + P_units;
            count++;
        }while(N != new_num);

        bw.write(count + "\n");
        bw.close();
    }
}
