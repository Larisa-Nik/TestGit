package OOP;
//сравнение котов нашего и чужого
public class Cat {  //класс Cat
    public int age;
    public int weight;
    public int  strenght;

    public Cat() {    //конструктор  для того, чтобі инициализировались поляCat

    }
    public boolean fight(Cat anotherCat) {
        int x = 0;
        int y = 0;
        if (this.age > anotherCat.age) {
            x++;
        }else if (this.age < anotherCat.age) {
            y++;
        }
        if (this.weight > anotherCat.weight) {
            x++;
        } if (this.weight < anotherCat.weight) {
            y++;
        }
        if (this.strenght > anotherCat.strenght) {
            x++;
        } if (this.strenght < anotherCat.strenght) {
            y++;
        }
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {


   //   System.out.println(cat.fight(anotherCat));
    }


}