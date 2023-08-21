package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistImplimentation {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(85);
        list.add(844);
        list.add(69);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
