package OOP;

public class Friend {

    String name;
    int age;
    char sex;

    public Friend(String frName) {
        name = frName;
    }

    public Friend(String frName, int frAge, char frSex) {
        name = frName;
        age = frAge;
        sex = frSex;
    }

    public Friend(String frName, int frAge) {
        name = frName;
        age = frAge;
    }


    public static void main(String[] args) {
        // Friend friend= new Friend("Basa",23,'m');
        // System.out.println(friend.name +" "+ friend.age);

    }

       }







