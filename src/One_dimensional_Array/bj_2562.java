package One_dimensional_Array;

import java.io.*;

public class bj_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, cnt = 0, val;

        for(int i = 0; i < 9; i++) {
            val = Integer.parseInt(br.readLine());
            if(val > max) {
                max = val;
                cnt = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
