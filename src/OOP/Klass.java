package OOP;

import java.util.Scanner;

public class Klass {

/*
Суммирование
*/
        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            int data = 0;
            while (true) {
                int d = scan.nextInt();
                if (d != -1) data = data + d;
               else {data = data + d; break;}
            }

            System.out.println(data);
        }

    }


