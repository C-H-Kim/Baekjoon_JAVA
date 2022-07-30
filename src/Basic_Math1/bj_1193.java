package Basic_Math1;

import java.io.*;

public class bj_1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cur_cnt = 1, prev_cnt_sum = 0;
        int numerator, denominator;

        while(true) {
            if(X <= prev_cnt_sum + cur_cnt) {
                if(cur_cnt % 2 == 1) {
                    numerator = (cur_cnt + 1) - (X - prev_cnt_sum);
                    denominator = X - prev_cnt_sum;
                    System.out.println(numerator + "/" + denominator);
                    break;
                }
                else {
                    numerator = X - prev_cnt_sum;
                    denominator = (cur_cnt + 1) - (X - prev_cnt_sum);
                    System.out.println(numerator + "/" + denominator);
                    break;
                }
            }
            else {
                prev_cnt_sum += cur_cnt;
                cur_cnt++;
            }
        }
    }
}
