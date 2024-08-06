package BaiTapThayHai15bai;

import java.util.Scanner;

import static java.lang.String.format;


public class bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toan, ly, hoa, van, su , dia;

            System.out.println("Moi ban nhap vao diem toan: ");
            toan = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao diem ly: ");
            ly = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao diem hoa: ");
            hoa = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao diem van: ");
            van = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao diem su: ");
            su = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao diem dia: ");
            dia = Integer.parseInt(sc.nextLine());

        float dtb = (float) ((toan + ly + hoa + van + su +dia)/6);
        if (dtb >= 9 && dtb <= 10) {
            System.out.println("Xep loai xuat sac");
        } else if (dtb >= 8 && dtb < 9) {
            System.out.println("Xep loai gioi");
        }if (dtb >= 6.5 && dtb < 8) {
            System.out.println("Xep loai kha");
        } else if (dtb >= 5 && dtb < 6.5) {
            System.out.println("Xep loai trung binh");
        }if (dtb >= 3.5 && dtb < 5) {
            System.out.println("Xep loai yeu");
        } else if (dtb >= 0 && dtb < 3.5) {
            System.out.println("Xep loai kem");
        }
        System.out.println(dtb);
        }

        }



