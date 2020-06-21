package OOP;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class SortirovkaFile {

    public static void main(String[] args) throws Exception {
        File dir = new File("C://Users//Larisa//Downloads//file.txt"); // путь_к_каталогу, к файлу
        FileReader fr = new FileReader(dir);  //FileReader и Scanner идут вместе. Неободимо их "связать" - для этого пишем название нашего объекта FileReader в Scanner
        Scanner scan = new Scanner(fr);
        ArrayList arrayList = new ArrayList(); // создание массива ArrayList
        // String []arrayStr= new String[10001];
        int i = 0;// i-внешний счетчик для записи в массив, r,b-счетчик для извлечения из массива строки для сортировки,с - счетчик для подсчета колчества одинаковых строк
        String a;

        while (scan.hasNextLine()) {     //.hasNextLine() - метод, который возвращает boolean - true или false, показывая, есть ли следующая строка.
            a = scan.nextLine();  //.nextLine()   - это метод, который считывает строку (до ENTER), и возвращает это значение
            arrayList.add(a);

            i++;
        }
        fr.close();  //Закрываем поток
        int r = 0, c = 0, b = 0, k = 0, d = 0, p = 0, th = 0, f = 0, tw = 0, w = 0, o = 0;
        for (r = 0; r < i; r++) {     //перебор каждой строки для сравнения с массивом строк
            c = 0;
            String text = (String) arrayList.get(r);
            String[] words = text.split(" ");
            //   System.out.println( text + " - " + r);

            for (b = r + 1; b < i; b++) {  //перебор массива строк для сравнения со строкой

                String text1 = (String) arrayList.get(b);
                String[] words1 = text1.split(" ");
                d = 0;
                for (String word : words) {

                    for (String word1 : words1) {

                        if ((word).equals(word1)) {
                            d++;
                            if (d == 6) {
                                w++;
                                //    text = text + "R" + d + "совпадений";
                                // System.out.println(word + " - " + word1 + "  R" + d + "  совпадений" + " - " + text + "      " + text1 +"  строка № "+r+"  строка № "+b);
                            }
                            if (d == 5) p++;

                            if (d == 4) f++;
                            if (d == 3) th++;
                            if (d == 2) tw++;
                            else if (d == 1) o++;
                        } else System.out.println(w + "  " + p + "  " + f + "  " + th + "  " + tw + "  " + o);
                    }
                }
            }
        }
    }
}


