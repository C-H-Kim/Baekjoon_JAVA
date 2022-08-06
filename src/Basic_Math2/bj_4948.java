package Basic_Math2;

import java.io.*;

public class bj_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime_arr = new boolean[246913];
        int[] cnt_arr = new int[246913];

        for(int i = 0; i < prime_arr.length; i++) {
            prime_arr[i] = true;
        }
        create_prime(prime_arr);
        prime_count(prime_arr, cnt_arr);

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                break;
            }

            bw.write((cnt_arr[n * 2] - cnt_arr[n]) + "\n");
        }
        bw.close();
    }
    public static void create_prime(boolean[] prime) {
        prime[0] = prime[1] = false;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = false;
            }
        }
    }

    public static void prime_count(boolean[] prime, int[] cnt) {
        int count = 0;
        for(int i = 2; i < prime.length; i++) {
            if(prime[i]) {
                count++;
            }

            cnt[i] = count;
        }
    }
}
