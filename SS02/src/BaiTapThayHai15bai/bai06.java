package BaiTapThayHai15bai;

import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Nhập vào Họ tên của chủ hộ.
        System.out.println("Moi ban nhap ten chu ho:");
        String hoVaTen = sc.nextLine();
//                Nhập vào số công tơ đầu, số công tơ cuối.
        System.out.println("Moi ban nhap so cong to dau:");
        int soDau = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap so cong to cuoi:");
        int soCuoi = Integer.parseInt(sc.nextLine());
//                Tính tổng số điện đã dung trong tháng và hiển thị.
        int soDienDaDung = soCuoi - soDau;
        System.out.println(soDienDaDung);
        int tongTien;
//        Tính số tiền phải trả theo cách tính sau:
//        -	Bậc 1: Mức sử dụng từ 0 - 50kWh: 1.806 đồng/kWh.
//                -	Bậc 2: Mức sử dụng từ 51 - 100kWh: 1.866 đồng/kWh.
//                -	Bậc 3: Mức sử dụng từ 101 - 200kWh: 2.167 đồng/kWh.
//                -	Bậc 4: Mức sử dụng từ 201 - 300kWh: 2.729 đồng/kWh
//                -	Bậc 5: Mức sử dụng từ 301 - 400kWh: 3.050 đồng/kWh
//                -	Bậc 6: Mức sử dụng từ 401Wh trở lên: 3.151 đồng/kWh

//        Hiển thị kết quả số tiền phải trả theo tháng của hộ đó
if(soDienDaDung <=50){
    tongTien = soDienDaDung * 1806;
}
else if(soDienDaDung > 50 && soDienDaDung < 100){
    tongTien = 50 * 1806 + (soDienDaDung - 50) * 1866;
}
else if(soDienDaDung > 100 && soDienDaDung <= 200){
    tongTien = 50 * 1806 + 50*1866 +(soDienDaDung - 100) * 2167;
}
else if(soDienDaDung > 200 && soDienDaDung <= 300){
     tongTien = 50 * 1806 + 50*1866 + 100*2167+ (soDienDaDung - 200) * 2729;
}
else if(soDienDaDung > 300 && soDienDaDung <= 400){
     tongTien = 50 * 1806 + 50*1866 + 100*2167 + 100*2729 + (soDienDaDung - 300) * 3050;
}
else
 tongTien = 50 * 1806 + 50*1866 + 100*2167 + 100*2729 + 100*3050 + (soDienDaDung - 400) * 3151;
        System.out.println(tongTien);
    }
}
