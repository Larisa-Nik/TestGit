package OOP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class SowFunkc {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        //  int b = Integer.parseInt(reader.readLine());
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(a);
        System.out.println("Minimum = " + min(arrayList1));
    }


            public static int min (ArrayList<Integer> arrayList1){
                int b, c,cmin;

                cmin = (Integer) arrayList1.get(0);

                for (b = 1; b < 5; b++) {  //перебор массива строк для сравнения со строкой
                    c = (Integer) arrayList1.get(b);
                    if (c < cmin) cmin = c;
                    else cmin = cmin;

                }

                return cmin;
            }


        }


