package BaiTapThayHai15bai;

import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C;
        double S;
        double x = 0,y = 0,z;
        while (x <=0) {
            System.out.println("Nhap do dai canh x");
            x = Integer.parseInt(sc.nextLine());
        }
        while ( y <=0 ){
            System.out.println("Nhap do dai canh y");
            y = Integer.parseInt(sc.nextLine());
        }
        do {
            System.out.println("Nhap do dai canh z");
            z = Integer.parseInt(sc.nextLine());
        } while (z <= x + y);
//        System.out.println("Ba canh cua tam giac " + x + " " + y + " " + z);
        C = x + y + z;
        S = (double) Math.sqrt(C*(C-x)*(C-y)*(C-z));
        System.out.println(C);
        System.out.printf("%.2f",S);
    }
    }

