package OOP;

public class DogKonstr {

    public static void main(String[] args) {

        class Dog {
            String name;
            int height;
            String color;

            public Dog(String nameDog) {
                name = nameDog;
            }

            public Dog(String nameDog, int heightDog) {
                name = nameDog;
                height = heightDog;
            }

            public Dog(String nameDog, int heightDog, String cvetDog) {
                name = nameDog;
                height = heightDog;
                color = cvetDog;
            }


        }
    }
}
