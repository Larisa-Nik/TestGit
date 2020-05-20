package OOP;
 class KonstuktorKotov {
    public static void main(String[] args) {

        Cats cats0 = new Cats("Vaska", 3, 4);
        Cats cats1 = new Cats("Muska", 3);
        Cats cats2 = new Cats("Tom");
        Cats cats3 = new Cats(3, "black", "Odessa");
    }

    public static class Cats {
        String name;
        int age;
        int weight;
        String address;
        String color;


        public Cats(String nameCat) {
            name = nameCat;
            age = 3;
            weight = 4;
            color = "black";
        }

        public Cats(String nameCat, int ageCat, int weightCat) {
            name = nameCat;
            age = ageCat;
            weight = weightCat;
            color = "black";
        }

        public Cats(String nameCat, int ageCat) {
            name = nameCat;
            age = ageCat;
            weight = 4;
            color = "black";
        }

        public Cats(int weightCat, String colorCat, String addressCat) {
            address = addressCat;
            age = 3;
            weight = weightCat;
            color = colorCat;
        }

    }
}


