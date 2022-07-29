package String;

import java.io.*;

public class bj_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sec = 0;
        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'W') {
                sec += 10;
            }
            else if(s.charAt(i) >= 'T') {
                sec += 9;
            }
            else if(s.charAt(i) >= 'P') {
                sec += 8;
            }
            else if(s.charAt(i) >= 'M') {
                sec += 7;
            }
            else if(s.charAt(i) >= 'J') {
                sec += 6;
            }
            else if(s.charAt(i) >= 'G') {
                sec += 5;
            }
            else if(s.charAt(i) >= 'D') {
                sec += 4;
            }
            else if(s.charAt(i) >= 'A') {
                sec += 3;
            }
        }
        System.out.println(sec);
    }
}
