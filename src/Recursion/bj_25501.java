package Recursion;

import java.io.*;

public class bj_25501 {
    public static int count = 0;
    public static int recursion(String s, int l, int r) {
        count++;
        if(l >= r)
            return 1;
        else if(s.charAt(l) != s.charAt(r))
            return 0;
        else
            return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            count = 0;
            int rt = isPalindrome(str);
            sb.append(rt + " " + count).append("\n");
        }
        System.out.println(sb);
    }
}
