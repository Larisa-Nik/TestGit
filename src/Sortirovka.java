import java.io.*;
import java.util.Arrays;

public class Sortirovka {

        public static void faner(int kol) throws IOException {
            int[] pri = new int[kol];
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            for (int i = 0; i < kol; i++) {
                System.out.println("Введите " + (i + 1) + "-е число");
                String sNum = br.readLine();  // ввод строки
                pri[i] = Integer.parseInt(sNum);  // преобразование строки в число
            }
            Arrays.sort(pri);  // сортировка элеметов массива
            System.out.println(Arrays.toString(pri));//возвращает строковое представление  Arrays.toString(pri)
        }
        public static void main(String[] args) throws IOException {
            faner(3);
        }
    }