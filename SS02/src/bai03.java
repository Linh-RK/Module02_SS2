import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so can doc:");
        int n = sc.nextInt();
        String hundred = "";
        String tens;
        String ones;
        String result;
        switch (n / 100) {
            case 0:
                hundred = "";
                break;
            case 1:
                hundred = "one hundred and ";
                break;
            case 2:
                hundred = "two hundred and ";
                break;
            case 3:
                hundred = "three hundred and ";
                break;
            case 4:
                hundred = "four hundred and ";
                break;
            case 5:
                hundred = "five hundred and ";
                break;
            case 6:
                hundred = "six hundred and ";
                break;
            case 7:
                hundred = "seven hundred and ";
                break;
            case 8:
                hundred = "eight hundred and ";
                break;
            case 9:
                hundred = "nine hundred and ";
                break;
            default:
                result = "out of ability";
                break;
        }
//        
        if (n % 100 < 10 && n % 100 > 0) {
            tens = "";
            ones = switch (n % 10) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "";
            };
        } else if (n % 100 - n % 10 >= 10 && n % 100 - n % 10 < 20) {
            ones = "";
            tens = switch (n % 10) {
                case 1 -> "eleven";
                case 2 -> "twelve";
                case 3 -> "thirteen";
                case 4 -> "fourteen";
                case 5 -> "fifteen";
                case 6 -> "sixteen";
                case 7 -> "seventeen";
                case 8 -> "eighteen";
                case 9 -> "nineteen";
                default -> "";
            };
        } else {
            ones = switch (n % 10) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "";
            };
            tens = switch ((n % 100-n%10)/10) {
                case 2 -> "twenty ";
                case 3 -> "thirty ";
                case 4 -> "forty ";
                case 5 -> "fifty ";
                case 6 -> "sixty ";
                case 7 -> "seventy ";
                case 8 -> "eighty ";
                case 9 -> "ninety ";
                default -> "";
            };
        }
        System.out.println(hundred + tens + ones); 
    }
}


