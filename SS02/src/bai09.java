import java.util.Scanner;

public class bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        double S = 0;
        double C = 0;
        do{
            System.out.print("""
                    Menu gồm : \s
                     \
                    1. Tính chu vi và diện tích hình chữ nhật .
                    2. Tính chu vi và diện tích hình tam giác
                    3. Tính chu vi và diện tích hình tròn.
                    4. Thoát""");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap do dai canh a");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap do dai canh b");
                    int b = Integer.parseInt(sc.nextLine());
                    C = (a + b) * 2;
                    S = a * b;
                    break;
                case 2:
                    System.out.println("Nhap do dai canh x");
                    int x = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap do dai canh y");
                    int y = Integer.parseInt(sc.nextLine());
                    int z;
                    do {
                        System.out.println("Nhap do dai canh z");
                        z = Integer.parseInt(sc.nextLine());
                    } while (z <= x + y);
                    C = x + y + z;
                    S = (double) Math.sqrt(C*(C-x)*(C-y)*(C-z));
                    break;
                case 3:
                    System.out.println("Nhap ban kinh r: ");
                    double r = Integer.parseInt(sc.nextLine());
                    C = (double)(2*Math.PI*r);
                    S = (double)(Math.PI*r*r);
                    break;
            }
            System.out.printf("Chu vi la:" + "%.2f",C);
            System.out.println();
            System.out.printf("Dien tich la:" + "%.2f",S);
            System.out.println();
        }while (choice != 4);
    }
}
