package String;

import java.io.*;
import java.util.HashSet;

public class bj_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[R];

        int cnt = 0;

        for(int i = 0; i < R; i++) {
            String str = br.readLine();
            int len = str.length();
            HashSet<Character> hs = new HashSet<Character>();

            for (int j = 0; j < len; j++) {
                if(len == 1) {
                    arr[i] = true;
                }

                if (j == 0) {
                    hs.add(str.charAt(j));
                }
                else {
                    if(str.charAt(j) != str.charAt(j-1)) {
                        if(hs.contains(str.charAt(j))) {
                            arr[i] = false;
                            break;
                        }
                        else{
                            arr[i] = true;
                            hs.add(str.charAt(j));
                        }
                    }
                    else {
                        arr[i] = true;
                    }
                }
            }
        }

        for(boolean val : arr) {
            if(val) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
