package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {
        
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

    
        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }
    
}
