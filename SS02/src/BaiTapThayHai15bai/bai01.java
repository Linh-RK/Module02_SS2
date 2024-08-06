package BaiTapThayHai15bai;

import java.util.Scanner;
//Bài 1.
//Tìm max,min của 2 số nguyên
//
//Bài 2
//Tìm max,min của 3 số nguyên
//
//Bài 3
//Tìm max,min của 4 số nguyên
//
//Bài 4
//Tìm max,min của 5 số nguyên
public class bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap vao so b");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap vao so c");
        int c = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap vao so d");
        int d = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap vao so e");
        int e = Integer.parseInt(sc.nextLine());
        int max, min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }
//
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min= d;
        }
        if (e < min) {
            min = e;
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri nho nhat la: " + min);
    }
}
