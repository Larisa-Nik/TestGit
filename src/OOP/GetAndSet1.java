package OOP;

public class GetAndSet1 {
    public static void main(String[] args) {
        Person1 person = new Person1();


    }

    public static class Person1 {
        private String name;
        private int age;
        private char sex;

        public void setName(String userName) {
            name = userName;
        }

        public String getName() {
            return name;
        }

        public void setAge(int userAge) {
            age = userAge;
        }

        public int getAge() {
            return age;
        }

        public void setSex(char userSex) {
            sex = userSex;
        }

        public char getSex() {
            return sex;
        }
    }
}