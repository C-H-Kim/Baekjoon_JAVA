package Basic_Math2;

import java.io.*;
import java.util.StringTokenizer;

public class bj_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] prime_arr = new boolean[end + 1];
        for(int i = 0; i <= end; i++) {
            prime_arr[i] = true;
        }
        create_prime(prime_arr);

        for(int i = start; i <= end; i++) {
            if(prime_arr[i]) {
                bw.write(i + "\n");
            }
        }
        bw.close();
    }

    public static void create_prime(boolean[] arr) {
        arr[0] = arr[1] = false;

        for(int i = 2; i <= Math.sqrt(arr.length); i++) {
            for(int j = i * i; j < arr.length; j += i) {
                arr[j] = false;
            }
        }
    }
}
