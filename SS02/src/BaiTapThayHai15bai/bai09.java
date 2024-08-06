package BaiTapThayHai15bai;

import java.util.Scanner;

public class bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac hai co dang: ax^2 + bx + c= 0");
        System.out.println("Moi ban nhap vao he so a:");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap vao he so b:");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap vao he so c:");
        double c = Integer.parseInt(sc.nextLine());
        double delta = b*b - 4*a*c;
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem duy nhat la:" +(-c/b));
            }
        } else {
            if (delta < 0) {
                System.out.println("Chuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Chuong trinh co nghiem kep: " + (-b/(2*a)));
            } else {
                System.out.println("Phuong trinh co nghiem kep: " + (-b-Math.sqrt(delta))/(2*a) +" va "+(-b+Math.sqrt(delta))/(2*a));
            }
        }
    }
}
