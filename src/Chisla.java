import java.util.Scanner;
//диапазон чисел с 1-999, выводить на экран описание: четное , нечетное, и какая разрядность
//если выходит за предел , то в таком случае ничего не выводить на экран. цифра ноль тоже за пределом , как и отрицательные числа
public class Chisla {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, kol;
        a = scan.nextInt();    // ввод числа с клавиатуры от 1 до 999
        String str = Integer.toString(a);  // преобразование введенного числа в строку
        kol = str.length();// определение количества символов в строке
        if (a <= 0) {System.out.print("");

        } else
        switch (kol){
            case 1:
            { if (a % 2 == 0) {System.out.println("четное однозначное число");

                } else  System.out.println("нечетное однозначное число");} break;
            case 2:
                if (a % 2 == 0 ) {
                    System.out.println("четное двузначное число");
                } else System.out.println("нечетное двузначное число"); break;
            case 3:
                if ( a % 2 == 0) {
                    System.out.println("четное трехзначное число");
                } else System.out.println("нечетное трехзначное число"); break;
            default:   System.out.print("");
            }
        }
    }
