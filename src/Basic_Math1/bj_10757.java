package Basic_Math1;

import java.io.*;
import java.util.StringTokenizer;

public class bj_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str_A, str_B;

        StringTokenizer st = new StringTokenizer(br.readLine());
        str_A = st.nextToken();
        str_B = st.nextToken();

        //최대 길이로 배열 선언
        int max_len = Math.max(str_A.length(), str_B.length());
        int[] A = new int[max_len + 1];
        int[] B = new int[max_len + 1];

        //A배열을 문자열의 역순으로 초기화
        int idx = 0;
        for(int i = str_A.length() - 1; i >= 0; i--) {
            A[idx] = str_A.charAt(i) - '0';
            idx++;
        }

        //B배열을 문자열의 역순으로 초기화
        idx = 0;
        for(int i = str_B.length() - 1; i >= 0; i--) {
            B[idx] = str_B.charAt(i) - '0';
            idx++;
        }

        for(int i = 0; i < max_len; i++) {
            int sum = A[i] + B[i];
            A[i] = sum % 10;
            A[i + 1] = A[i + 1] + sum / 10;
        }

        StringBuilder sb = new StringBuilder();
        if(A[max_len] != 0) {
            sb.append(A[max_len]);
        }
        for(int i = max_len - 1; i >= 0; i--) {
            sb.append(A[i]);
        }
        System.out.println(sb);
    }
}
