import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
//        0<= điểm TB < 5 Xếp loại yếu .
//        5<= điểm TB <6.5 Xếp loại trung bình.
//        6.5<= điểm TB <8 Xếp loại khá
//        8 <= điểm TB <9 Xếp loại giỏi
//        9 < = điểm TB Xếp loại xuất sắc
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap diem toan:");
        float toan = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap diem ly:");
        float ly = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap diem hoa:");
        float hoa = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap diem van:");
        float van = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap diem anh:");
        float anh = Integer.parseInt(sc.nextLine());
        float diemTrungBinh = (toan + ly + hoa + van + anh)/ 5;
        if (diemTrungBinh >= 9) {
            System.out.println("Xếp loại xuất sắc");
        }
        else if (diemTrungBinh < 9 && diemTrungBinh >= 8) {
            System.out.println("Xếp loại giỏi");
        } else if (diemTrungBinh < 8 && diemTrungBinh >= 6.5) {
            System.out.println("Xếp loại khá");
        } else if (diemTrungBinh < 6.5 && diemTrungBinh >= 5) {
            System.out.println("Xếp loại trung bình");
        }else {
            System.out.println("Xếp loại yếu");
        }
        System.out.println(diemTrungBinh);
    }
}
