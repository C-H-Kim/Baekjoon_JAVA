package String;

import java.io.*;

public class bj_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A']++;
            }
            else {
                arr[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                ch = (char)(i + 65);
            }
            else if(max == arr[i]) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
