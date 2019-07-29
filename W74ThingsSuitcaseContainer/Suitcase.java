import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Suitcase {
    private final int MAX_WEIGHT;
    ArrayList<Things> suitcase;

    public Suitcase(int MAX_WEIGHT) {
        this.MAX_WEIGHT = MAX_WEIGHT;
        this.suitcase = new ArrayList<Things>();
    }

    public void addThing(Things things) {
        int i = totalWeight() + things.getWeight();
        if (i < this.MAX_WEIGHT) {
            this.suitcase.add(things);
        }
    }

    public void printThings() {
        for (Things t : suitcase) {
            System.out.println(t.toString());
        }
    }

    public int totalWeight() {
        int tw = 0;
        for (Things t : suitcase) {
            tw += t.getWeight();
        }
        return tw;
    }

    public int getWeight(){
        return MAX_WEIGHT;
    }

    public Things heaviestThing(){
        Things heaviest = suitcase.stream().max(Comparator.comparing(h -> h.getWeight())).get();
        return heaviest;
    }

    public String toString() {
        if (suitcase.isEmpty()) {
            return "empty";
        } else if (suitcase.size() == 1) {
            return suitcase.size() + " thing (" + totalWeight() + " kg)";
        } else {
            return suitcase.size() + " things (" + totalWeight() + " kg)";
        }
    }
}