package Basic_Math1;

import java.io.*;
import java.util.StringTokenizer;

public class bj_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int test_case;
        int floor, roomNum;
        int height, N;

        test_case = Integer.parseInt(br.readLine());

        for(int i = 0; i < test_case; i++) {
            st = new StringTokenizer(br.readLine());

            height = Integer.parseInt(st.nextToken());
            st.nextToken();
            N = Integer.parseInt(st.nextToken());

            if(N % height == 0) {
                floor = height * 100;
                roomNum = N / height;
            }
            else {
                floor = (N % height) * 100;
                roomNum = N / height + 1;
            }

            bw.write(floor + roomNum + "\n");
        }
        bw.close();
    }
}
