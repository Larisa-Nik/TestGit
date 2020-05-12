package OOP;

public class ManAndWoman {
    //  Мужчина и женщина
    public static void main(String[] args) {
        Woman woman1 = new Woman("Agnes", 23, "Odessa");
        Woman woman2 = new Woman("Kati", 26, "Minsk");
        System.out.println(woman1.name +" "+ woman1.age+" "+ woman1.address);
        System.out.println(woman2.name +" "+ woman2.age+" "+ woman2.address);
        Man man1 = new Man("Tom", 27, "Brest");
        Man man2 = new Man("Djon", 30, "Lvov");
        System.out.println(man1.name +" "+ man1.age+" "+ man1.address);
        System.out.println(man2.name +" "+ man2.age+" "+ man2.address);
    }
    public static class Woman {  //создаем клас Woman с параметрами
        String name;
        int age;              // это проект класса Woman, типо чертеж
        String address;

        Woman(String womanName, int womanAge, String womanAddress) {  //создаем конструктор Woman
            name = womanName;
            age = womanAge;             //инструкция как будет создаваться проект
            address = womanAddress;
        }
    }
    public static class Man {
        Man(String manName, int manAge, String manAddress) {
            name = manName;
            age = manAge;
            address = manAddress;
        }
        String name;
        int age;
        String address;
    }
}






