import java.util.Scanner;

public class KakNazvali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int data = scan.nextInt();
        int mes = scan.nextInt();
        int got = scan.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился  " + data + "." + mes + "." + got);

    }
}
