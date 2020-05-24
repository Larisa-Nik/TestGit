package OOP;

public class KamenChik {

    public static void main(String[] args) {
        Mens mens=new Mens(50);
        Kamen kamen =new Kamen(34);
        boolean a= mens.SmogPodnKamen(kamen);
        System.out.println(a);
    }
    public static class Mens {
        int gruzPodn;

        public Mens(int gruzPodnMens) {
            gruzPodn = gruzPodnMens;
        }

        public boolean SmogPodnKamen(Kamen kamen) {
            if (gruzPodn > kamen.wes  ) return true;
            return false;
        }
    }

    public   static class   Kamen {
        int wes;

        public Kamen(int wesMens) {
            wes = wesMens;
        }
    }

}