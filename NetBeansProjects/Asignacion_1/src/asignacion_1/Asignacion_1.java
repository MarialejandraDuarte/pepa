package asignacion_1;

import java.util.ArrayList;
import java.util.List;

public class Asignacion_1 {

    public static void main(String[] args) {

        List<Integer> x = new ArrayList<Integer>();
        x.add(new Integer(3));
        doStuff(x);
        int c = 0;
        

        try {
            for (Integer i : x) {
                c++;
                System.out.println(i + " ");
            }
        } catch (Exception e) {

            
            System.out.printf("%.0f\n", x.get(c));
        }
    }

    public static void doStuff(List y) {
        y.add(new Integer(4));
        y.add(new Float(3.14f));
       
    }
}
