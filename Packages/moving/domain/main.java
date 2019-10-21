package moving.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items); // sort uses whatever we've defined in compareTo
        System.out.println(items);

    }
}
