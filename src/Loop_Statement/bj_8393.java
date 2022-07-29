package Loop_Statement;

import java.util.Scanner;

public class bj_8393 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter, sum = 0;

        iter = sc.nextInt();

        for(int i = 1; i <= iter; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
