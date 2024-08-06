package BaiTapThayHai15bai;

public class bai14 {
    public static void main(String[] args) {
//        Bài 14
//        Viết chương trình nhập vào một số nguyên dương n(nếu nhập không đúng thì yêu cầu nhập lại). Hiển thị các số chẵn từ 1 đến n.
int number;
do{
    System.out.println("Enter a positive integer:");
     number = Integer.parseInt(System.console().readLine());
}
while ( number <= 0);
for(int i = 1; i <= number; i++){
    if(i % 2 != 0){
        continue;
    } else {
        System.out.println(i);
    }
}
    }
}
