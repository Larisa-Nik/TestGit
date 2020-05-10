import java.util.Scanner; // импорт сканера
///
public class PerevorotSlov {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, i, b;
        String str = scan.nextLine();
        a = str.length();
        b = a;

        for (i = 0; i < a; i++) {
            b = b - 1;
            char c = str.charAt(b);
            System.out.print(c);


        }
    }

}
