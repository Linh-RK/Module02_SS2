public class bai06 {
    public static void main(String[] args) {
        int N = 1;
        while ( N%5!=0 || N%7!=0 || N%11!=0 ) {
             N+=1;
        }
        System.out.println(N);
    }
}
