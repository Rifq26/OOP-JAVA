/**
 * Belajar Java - Collections - (ArrayList)
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        
        // collections
        //ArrayList al = new ArrayList(); //non-generic
        ArrayList<String> al2 = new ArrayList<String>(); //generic

        al2.add("Rifqi");
        al2.add("Muhammad");

        Iterator it = al.Iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
