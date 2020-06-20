package OOP;

import java.util.Date;
import java.lang.NumberFormatException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Консоль-копилка
*/

public class Cat1 {

    public static void main(String[] args) throws Exception {
        int a1 = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                System.out.println("сумма");
                System.out.println(a1);
                break;
            }
            int a = Integer.parseInt(s);
            a1 += a;
            System.out.println(a1);
            System.out.println(s);
        }
    }
}