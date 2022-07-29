package Basic_Math1;

import java.io.*;
import java.util.StringTokenizer;

public class bj_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A, B, C;

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        if(C - B <= 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(A / (C - B) + 1);
        }
    }
}
