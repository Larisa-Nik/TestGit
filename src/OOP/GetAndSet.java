package OOP;
//использование геттеров и сеттеров
public class GetAndSet {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Вася");
        person.setAge(12);
        System.out.println(person.getAge());
        System.out.println( person.getName());

    }
}

class Person{
    private String name;
    private int age;

    public  void  setName( String userName) {
        name=userName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
         age=userAge;
    }
    public int getAge(){
        return age;
    }

}