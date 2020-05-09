import java.util.Scanner; // импорт сканера
public class OpisanieChisel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();    // ввод числа с клавиатуры
        if (a > 0 && a % 2 == 0) {
            System.out.println("положительное четное число");
        }
        if (a < 0 && -1 * a % 2 > 0) {
            System.out.println(" отрицательное нечетное число");
        }

        if (a < 0 && a % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (a > 0 && a % 2 > 0) {
            System.out.println("положительное нечетное число");
        }

    }
}