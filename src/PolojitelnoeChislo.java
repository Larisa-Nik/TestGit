
//ввести с клавы три целых числа. Вывести на экран количество положительных чисел среди этих трех.
//если положительных нету, программа должна вывести "0". Причем "0" не есть положительным ни отрицательным-- нейтральное
import java.util.Scanner;
public class PolojitelnoeChislo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, i, kol = 0;

        for (i = 0; i < 3; i++) {
            a = scan.nextInt();    // ввод числа с клавиатуры от 1 до 999
            if (a > 0) kol = kol + 1;
        }
        if (kol == 0) System.out.print("");
        else System.out.print(kol);

    }
}
