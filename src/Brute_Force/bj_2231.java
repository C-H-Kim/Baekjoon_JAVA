package Brute_Force;

import java.io.*;

public class bj_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str_N = br.readLine();
        int N_length = str_N.length();
        int N = Integer.parseInt(str_N);

        int result = 0;

        for(int i = (N - N_length * 9); i < N; i++) {
            int number = i;
            int sum = number;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
