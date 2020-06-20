package OOP;

public class CatSkok {
    public static void main(String[] args) {
        Cat cat=new Cat();
       Cat cat1=new Cat(1);
       Cat cat2=new Cat(2);

        System.out.println(cat.canJump(1));
        System.out.println(cat1.canJump(2));
        System.out.println(cat2.canJump(3));
    }
    static class Cat {
        int jumpHeight;

       public Cat(){
           jumpHeight=2;
        }

        public Cat(int jumpHeightCat){
            jumpHeight=jumpHeightCat;
        }
       boolean canJump(int meter) {

            if (jumpHeight > meter) {return true;}
            else return false;
        }
    }
}
