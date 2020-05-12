package OOP;
 //сравнение котов нашего и чужого
public class Cat {  //класс Cat
    public int age;
    public int weight;
    public int strenght;

    public Cat(int age,int weight,int strenght) {    //конструктор  для того, чтобі инициализировались поляCat
    this.age=age;
    this.weight=weight;
    this.strenght=strenght;
    }

    public boolean fight(Cat anotherCat) {
        int x = 0;
        int y = 0;
        if (this.age >= anotherCat.age) { x++;
        }
        else if (this.age < anotherCat.age) { y++;
        }
        if (this.weight >= anotherCat.weight) { x++;
        }
        else if (this.weight < anotherCat.weight) { y++;
        }
        if (this.strenght>=anotherCat.strenght){ x++;
        }
        else if(this.strenght < anotherCat.strenght){ y++;}
        if(x>y){return true;}
        else {return false;}
    }

    public static void main(String[]args) {


    }
    }

