import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String result;
        System.out.println("Moi ban nhap vao 1 so tu nhien:");
        n = sc.nextInt();
        if(n%3==0 && n%5==0){
            result = "Chia het cho ca 3 va 5";
        } else if(n%3==0 && n%5 != 0){
            result = "Chi chia het cho 3";
        } else if(n%3!=0 && n%5 == 0){
            result = "Chi chia het cho 5";
        } else
            result = "Khong chia het cho 3, cung khong chia het cho 5";
        System.out.println( n +" "+ result);
    }
}
