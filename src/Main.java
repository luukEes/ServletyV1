import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<Integer>();
        for (int i = 10; i <= 19; i++) {
            elements.add(i);
        }
        System.out.println(elements);
        Iterator<Integer> iterator = elements.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int i : elements) {
           System.out.println(i);
        }
    }

}