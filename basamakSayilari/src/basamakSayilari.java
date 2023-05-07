import java.util.Scanner;

public class basamakSayilari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, total = 0;
        System.out.print("Bir sayı giriniz : ");
        a = input.nextInt();

        while (a != 0){
            total +=a  % 10;
            a = a/10;
        }

        System.out.print("Sayıların toplamı :" + total);

    }
}
