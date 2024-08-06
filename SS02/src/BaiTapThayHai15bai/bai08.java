package BaiTapThayHai15bai;

import java.util.Scanner;

public class bai08 {
//    Giải PTB1: ax + b = 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac nhat co dang: ax + b = c");
        System.out.println("Moi nhap vao he so a:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap vao he so b:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap vao he so c:");
        int c = Integer.parseInt(sc.nextLine());
        if (a==0 && b==c) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a==0 && b!=c) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (a!=0) {
            System.out.println("Phuong trinh co nghiem x = " + (float)(c-b)/a);
        }
    }

}
