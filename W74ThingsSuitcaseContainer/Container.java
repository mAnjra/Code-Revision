import java.util.ArrayList;

public class Container {
    private final int MAX_WEIGHT;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Container(int max_weight) {
        this.MAX_WEIGHT = max_weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int i = suitcase.totalWeight() + totalWeightOfAllSuitcases();
        if (i < MAX_WEIGHT) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeightOfAllSuitcases() {
        int tw = 0;
        for (Suitcase s : suitcases) {
            tw += s.totalWeight();
        }
        return tw;
    }

    public void printThings(){
        
        for(Suitcase s : suitcases){
            s.printThings();
        }
    }

    public String toString() {
        if (suitcases.size() == 0) {
            return "empty";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalWeightOfAllSuitcases() + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + totalWeightOfAllSuitcases() + " kg)";
        }
    }
}