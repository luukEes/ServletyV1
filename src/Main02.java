import java.util.List;
public class Main02 {
    public static void removeDivider(List<Integer> list, int divider) {
        for (int i = 0; i < 10; i++) {
            if (list.get(i) % divider == 0){
                list.remove(i);
                System.out.println(i);
            }
        }
    }
}

