package Conditional_Statement;

import java.util.Scanner;

public class bj_14681 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a * b > 0) {
            if(a > 0)
                System.out.println("1");
            else
                System.out.println("3");
        }
        else {
            if(a > 0)
                System.out.println("4");
            else
                System.out.println("2");
        }
    }
}
