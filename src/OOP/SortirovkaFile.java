package OOP;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class SortirovkaFile {

    public static void main(String[] args)throws Exception {
        File dir = new File("C://Users//Larisa//Downloads//file.txt"); // путь_к_каталогу, к файлу
        FileReader fr= new FileReader(dir);  //FileReader и Scanner идут вместе. Неободимо их "связать" - для этого пишем название нашего объекта FileReader в Scanner
        Scanner scan = new Scanner(fr);
        String []arrayStr= new String[10001];
        int i = 0;

        while (scan.hasNextLine()) {     //.hasNextLine() - метод, который возвращает boolean - true или false, показывая, есть ли следующая строка.
           // System.out.println(scan.nextLine());//.nextLine()   - это метод, который считывает строку (до ENTER), и возвращает это значение
          arrayStr[i]=scan.nextLine();
          System.out.println(arrayStr[i] );
            i++;
        }
        //System.out.println(arrayStr[0]);
        fr.close();  //Закрываем поток




        }
    }




