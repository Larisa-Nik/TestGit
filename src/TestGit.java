
  import java.util.Scanner; // импорт сканера
  public class TestGit {
      public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);

          String name1 = scan.nextLine();
          String name2 = scan.nextLine();

          if (name1.equals(name2))
              System.out.println("Имена идентичны.");  //name1.equals(name2) - сравнение слов посимвольно
          else if (name1.length() == name2.length())
              System.out.println("Длины имен равны.");  //name1.length() - возвращает количество символов
          else if (name1.equals(name2) == false && name1.length() != name2.length()) System.out.print("");

      }
  }
// for new sohranenie
