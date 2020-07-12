import java.util.ArrayList;

class Farm {
    int capacity; // виділення полів під максимальна допустиму кількість корів на фермі
    ArrayList<Cow> cows;  // виділення пам"яті під список корів
    ArrayList<Cow> defCows; // виділення пам"яті під корів , яких не приймають
    public Farm(int capacity) {// инициация списку корів - конструктор
        cows = new ArrayList<>(); //список корів які відповідають умовам
        defCows=new ArrayList<>();//список невідповідних корів
        this.capacity = capacity; //кількість місць на фермі
    }

    public int kolFree() {        // метод який підраховує реальну кількість вільних місць на фермі
        int freeSpace = this.capacity- this.cows.size();  //
        System.out.println("cvoboda "+ freeSpace);
        return freeSpace;
    }


    public void addCow(Cow cow) { //умови по яких приймаються корови на ферму
        if (cow.age > 6)  {this.defCows.add(cow);         // вік корови не більше 6 років
            return;}
        if (this.cows.size() >= this.capacity)// кількість корів перевищує загальну кількість місць на фермі
        { System.out.println(" кількість місць на фермі"+ this.capacity+" кількість корів"+this.cows.size());  //
            return;}
        this.cows.add(cow); //запис в книгу ферми, якщо

    }

    public boolean checkPlace(){  //перевірка, чи є місця на фермі
        if (this.cows.size()>=this.capacity){return false;}   // порівнюємо кількість корів, яких прийняли і кількість місць
        else return true;
    }
    public void  shoW()  {
        System.out.println( "На нашій фермі проживають Корови в кількосьті "+ this.cows.size());
        for (int i=0;i<this.cows.size();i++){
            System.out.println("info"+ this.cows.get(i).toString());
        }
    }
}
class Cow {
    String name;
    String color;
    int age;
    public Cow(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age= age;
    }
    public String toString()  {
        String info="Корова має name "+name+", color "+color+", age "+age;
        return info;
    }

}

class FermaMoj {
    public static void main(String[] args) {

        Farm farm12 = new Farm(4);
        Farm farm11 = new Farm(2);
        Cow cow1 = new Cow("mashka","black",4);
        Cow cow2=new Cow("dashka","red",3);
        Cow cow3=new Cow("luska","white", 7);
        Cow cow4 = new Cow("zorka", "black-white",5);
        Cow cow5 = new Cow("marinka", "red",6);
        Cow cow6 = new Cow("krasavka", "white-red",2);


        farm11.addCow(new Cow("dashka", "red",3));
        farm11.addCow(new Cow("luska", "white",8));
        farm12.addCow(cow1);
        farm11.shoW();
        farm12.shoW();
        System.out.println("на ферме 12 есть "+farm12.kolFree()+ " свободных мест");
        System.out.println("на ферме 11 есть "+farm11.kolFree()+ " свободных мест");
    }
}