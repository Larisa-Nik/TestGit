
    import java.util.Scanner; // импорт сканера
    public class MassivSlov {

        public static void main(String[] args) {
            System.out.print("Введите любое целое число от 1 до 10000: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            int tysacha, sotni, desat, tysachaOst, sotniOst, desatOst;
            int k1 , k2 , k3 , k4;                                   //  для выбора нужной строчки в массиве
            String[][]array = new String[][]{                        // задаем сам массив слов
                    {"", " одна тысяча", "две тысячи", "три тысячи", "четыре тысячи", "пять тысячь", "шесть тысячь", "семь тысячь", "восемь тысячь", "девять тысяч"}, //k1
                    {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"}, //k2
                    {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"},//k3
                    {"", "одинадцать долларов", "двенадцать долларов", "тринадцать долларов", "четырнадцать долларов", "пятнадцать долларов", "шестьнадцать долларов", "семнадцать долларов", "восемьнадцать долларов", "девятьнадцать долларов"},//k4
                    {"", "один доллар", "два доллара", "три доллара", "четыре доллара", "пять долларов", "шестьдолларов", "семь долларов", "восемь долларов", "девять долларов"}  //k4

            };
// проверка чисел
            if (1000 < number) {
                System.out.println("Вы ввели четырехзначное число " + number);
            }
            if (100 < number) {
                if (number < 1000) System.out.println("Вы ввели трехзначное число " + number);
            }
            if (10 < number) {
                if (number < 100) System.out.println("Вы ввели двузначное число " + number);
            }

            tysacha = number / 1000; k1=0;   // высчитывание  нужного столбца в строчке в массива
            tysachaOst = number % 1000;
            sotni = tysachaOst / 100; k2=1;
            sotniOst = tysachaOst % 100;
            desat = sotniOst / 10;
            desatOst = sotniOst % 10; ;
            if (10 < sotniOst && sotniOst <20) { k4=3;k3=2;desat=0; }
            else { k4=4;k3=2;sotniOst=0;}


            System.out.println(array[k1][tysacha]+" " +array[k2][sotni]+ " " +array[k3][desat]+" "+ array[k4][desatOst]); //вывод на экран

        }

    }



