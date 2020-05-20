package OOP;

public class Person2 {

    public static void main(String[] args) {
        Person2 person2 = new Person2("Vaska");
        int count = person2.countNameLetters();
        System.out.println(count);
       String str1 = person2.rotateMyName();
        System.out.println(str1);
    }

    String name;

    public Person2(String namePer2) {
        name = namePer2;
    }

    public int countNameLetters() {
        int a = name.length();
        return a;
   }

    public String rotateMyName() {
      int  a = name.length();
       int b = a; int i;
       String str ="";
        for (i = 0; i < a; i++) {
            b = b - 1;
            char c = name.charAt(b);
            str= str + c;

        }

        return str;

    }
}