package Basic_Math1;

import java.io.*;

public class bj_2922 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int range_min = 2;

        if(N == 1) {
            System.out.println(1);
        }
        else {
            while(range_min <= N) {
                range_min += (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
