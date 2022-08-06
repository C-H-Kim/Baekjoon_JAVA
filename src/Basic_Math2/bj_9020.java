package Basic_Math2;

import java.io.*;

public class bj_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime_arr = new boolean[10001];
        for(int i = 0; i < prime_arr.length; i++) {
            prime_arr[i] = true;
        }
        create_prime(prime_arr);

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int a = n / 2;
            int b = n / 2;

            while(true) {
                if(prime_arr[a] && prime_arr[b]) {
                    bw.write(a + " " + b + "\n");
                    break;
                }
                a--;
                b++;
            }
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
}
