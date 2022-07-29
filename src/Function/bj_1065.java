package Function;

import java.io.*;

public class bj_1065 {
    public static int arithmetic_sequence(int number) {
        int cnt = 0;

        if(number < 100) {
            return number;
        }
        else {
            cnt = 99;

            for(int i = 100; i <= number; i++) {
                int hun = i / 100;
                int ten = (i % 100) / 10;
                int one = i % 10;

                if((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(arithmetic_sequence(num));
    }
}
