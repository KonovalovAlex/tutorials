package tutorials.changeSort;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> treemap = new TreeSet();

        treemap.add(1);
        treemap.add(2);
        treemap.add(5);
        treemap.add(3);
        treemap.add(4);
        treemap.comparator().reversed();

        System.out.println(treemap);
    }
}
