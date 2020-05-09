import java.util.Scanner;
public class PerevorotSlov1 {
     public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a, i, b;
            String str = scan.nextLine();
         String str1="";
            a = str.length();
            b = a;
            for (i = 0; i < a; i++) {
                b = b - 1;
                char c = str.charAt(b);
                str1= str1+ c;
            }
         System.out.print(str1);
        }
    }

