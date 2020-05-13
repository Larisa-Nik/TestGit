import java.util.Scanner; // импорт сканера
public class SredneArifmet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sumAr = 0;
        double n = 0;
       double b = 0;

        while (true) {
            int number = scan.nextInt();

            if (number == -1) break;
            sumAr = sumAr + number;
            n = n + 1;
            b = sumAr / n;

        }
        System.out.print(b +" "+sumAr+" "+" "+n);
    }
}




