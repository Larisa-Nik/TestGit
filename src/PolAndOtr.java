import java.util.Scanner;

public class PolAndOtr {
    //ввести с клавы три целых числа. Вывести на экран количество положительных чисел среди этих трех b и количество отрицательных.
//если положительных нету, программа должна вывести "0". Причем "0" не есть положительным ни отрицательным-- нейтральное
// что то
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a, i, kol = 0, kol1=0;

            for (i = 0; i < 3; i++) {
                a = scan.nextInt();    // ввод числа с клавиатуры от 1 до 999
                if (a > 0) kol = kol + 1;
                else  if (a<0) kol1=kol1+1;
            }

            System.out.println( "количество положительных чисел: " +kol);
                System.out.print( "количество отрицательных чисел: " +kol1);

        }
    }


