import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0,y = 0,z;
        while (x <=0) {
            System.out.println("Nhap do dai canh x");
             x = sc.nextInt();
        }
        while ( y <=0 ){
            System.out.println("Nhap do dai canh y");
            y = sc.nextInt();
        }
        do {
            System.out.println("Nhap do dai canh z");
            z = sc.nextInt();
        } while (z <= x + y);
        System.out.println("Ba canh cua tam giac " + x + " " + y + " " + z);
//        C = x + y + z;
//        S = (double) Math.sqrt(C*(C-x)*(C-y)*(C-z));
    }
}
