package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Xz {

        public static void main(String[] args) throws IOException {
            BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
            double weight = Double.parseDouble(bis.readLine());
            double height = Double.parseDouble(bis.readLine());

            Body.calculateMassIndex(weight, height);
        }
        public static class Body{
            public static void calculateMassIndex(double weight, double height){
                double ind=weight/(height*height);
                if( ind< 18.5) System.out.println("Недовес:меньше чем 18.5");
                else if (ind>=18.5&& ind<25) System.out.println("Нормальный: между 18.5 и 25");
                else if (ind>=25&&ind<30)System.out.println("Избыточный вес:между 25 и 30");
                else if (ind>=30)System.out.println("Ожирение:30 и больше");
            }

        }
    }



