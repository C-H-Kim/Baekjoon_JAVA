package Basic_Math1;

import java.io.*;
import java.util.StringTokenizer;

public class bj_2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int up, down, length;
        int day = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        up = Integer.parseInt(st.nextToken());
        down = Integer.parseInt(st.nextToken());
        length = Integer.parseInt(st.nextToken());

        day = (length - down) / (up - down);

        if((length - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
