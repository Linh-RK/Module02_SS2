import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap khoang so tu nhien can tinh tong tu:");
        int a = sc.nextInt();
        System.out.println("den:");
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
