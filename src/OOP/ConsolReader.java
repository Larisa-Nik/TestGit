package OOP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


//package OOP;

public class ConsolReader {


public static String readString() throws IOException {
    BufferedReader reader = null;
    String a1 = reader.readLine();
    return a1;
}
    public static int readInt() throws IOException {
        BufferedReader reader = null;
        String a2 = reader.readLine();
        int a = Integer.parseInt(a2);
       return a;
    }
    public static double  readDouble() throws IOException {
        BufferedReader reader = null;
        String a2 = reader.readLine();
        double a = Integer.parseInt(a2);
        return a;
    }

  //  public static boolean readBoolean(){

  //  }
    public static void main(String[] args) throws IOException {
     //   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(readString());
        System.out.println(readInt());
        System.out.println(readDouble());
    }
}