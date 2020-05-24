package OOP;

public class DogCatMouse {

    public static void main(String[] args) {
        Mouse jerryMouse=new Mouse("Jerry",12,5);
        Dog harryDog=new Dog("Harry",45,20);
        Cat tomCat=new Cat("Tom",22,15);
    }
    public static class Mouse{
            String name;
            int height;
            int tail;

            public Mouse(String name, int height,int tail) {
                this.name=name;
                this.height=height;
                this.tail=tail;
            }
        }
    public static class Dog{
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name=name;
            this.height=height;
            this.tail=tail;
        }
    }
    public static class Cat{
        String name;
        int height;
        int tail;

        public Cat(String name, int height,int tail) {
            this.name=name;
            this.height=height;
            this.tail=tail;
        }
    }
}
