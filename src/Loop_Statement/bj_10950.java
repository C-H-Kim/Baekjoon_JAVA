package Loop_Statement;

import java.util.Scanner;

public class bj_10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter;
        int a, b;

        iter = sc.nextInt();

        for(int i = 0; i <= iter; i++) {
            if(sc.hasNextInt()) {
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
