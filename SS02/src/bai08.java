import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Moi ban chon chuc nang can su dung:" +
                    "Menu gồm :\n" +
                    "1. Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2. Kiểm tra số nguyên tố.\n" +
                    "3. Kiểm tra một số có chia hết cho 3 không.\n" +
                    "0. Thoát");
            choice = input.nextInt();
            if (choice == 0) {
                return;
            } else {
                System.out.println("Moi ban nhap so n");
                int n = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        if (n % 2 == 0)
                            System.out.println(n + " la so chan");
                        else
                            System.out.println(n + " la so le");
                        break;
                    case 2:
                        boolean check = true;
                        if (n < 2)
                            System.out.println(n + " khong la so nguyen to");
                        else {
                            for (int i = 2; i < n; i++) {
                                if (n % i == 0) {
                                    check = false;
                                    break;
                                }
                            }
                            if (check)
                                System.out.println(n + " la so nguyen to");
                            else
                                System.out.println(n + " khong la so nguyen to");
                        }
                        break;
                    case 3:
                        if (n % 3 == 0)
                            System.out.println(n + " la so chia het cho 3");
                        else
                            System.out.println(n + " khong la so chia het cho 3");
                        break;
                    case 0:
                        return;
                    default:
                        break;
                }
            }
        } while (choice != 0);
    }
}




