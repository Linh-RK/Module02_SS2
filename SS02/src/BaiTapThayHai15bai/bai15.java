package BaiTapThayHai15bai;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
//        Viết chương trình nhập vào các thông tin: (chỉ khai báo biến)
//        -	Mã sản phẩm
//        -	Tên sản phẩm
//        -	Nhà sản xuất
//        -	Năm sản xuất
//        -	Giá bán
        String proID, proName, producer;
        int yearMaking;
        double price = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter product ID: ");
            proID = sc.nextLine();
            if(proID.length() != 5){
                System.out.println("Product ID must be 5 character!");
            } else {
                String towChar = proID.substring(0, 2);
                if(!towChar.equals("SP")){
                    System.out.println("Product ID must start with 'SP'!");
                } else {
                    String threeChar = proID.substring(2);
                    try{
                        int number = Integer.parseInt(threeChar);
                        System.out.println(proID);
                        break;
                    }
                    catch (Exception e){
                        System.out.println("Product ID of last three character must be number!");
                    }
                }
            }
        }
        while (true);
//        Trong đó:
//        -	Mã sản phẩm cố định 5 kí tự, bắt đầu bằng chữ SP, 3 số cuối phải là số
//                -	Tên sản phầm tối thiểu 5 kí tự
//        -	Nhà sản xuất tối thiểu 5 kí tự

        do {
            System.out.println("Enter product name: ");
            producer = sc.nextLine();
        } while (producer.length() < 5);
//        -	Năm sản xuất phải là số nguyên từ năm 2000 trở lại đây, không vượt quá năm hiện tại
        do{
            System.out.println("Enter product of made year: ");
            try{
                yearMaking = Integer.parseInt(sc.nextLine());
                int currenYear = LocalDate.now().getYear();
                if(yearMaking > currenYear || yearMaking < 2000){
                    System.out.println("Year making must be between 2000 and current year!");
                } else
                    break;
            }catch (Exception e){
                System.out.println("Product of made year must be number!");
            }
        }
        while (true);

//                -	Giá bán là số thực, không âm
        do{
            System.out.println("Enter product price: ");
            try{
                price = Double.parseDouble(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Product price must be number!");
            }
            if (price < 0){
                System.out.println("Product price must be a positive number!");
            }
            else
                break;
        }
        while (price < 0);
    }
}
