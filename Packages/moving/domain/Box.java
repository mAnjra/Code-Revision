package moving.domain;


import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maxCapacity;
    private List<Thing> box;

    public Box(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<>();
    }

    public boolean addThing(Thing thing){

        int full = this.getVolume() + thing.getVolume();
        if(full>this.maxCapacity){
            return false;
        }else
            this.box.add(thing);
            return true;
    }


    @Override
    public int getVolume() {
        int boxVolume = 0;
        for (Thing t : this.box){
            boxVolume += t.getVolume();
        }
        return boxVolume;
    }

    public void printBox() {
        for (Thing t : box) {
            System.out.println(t.getVolume());
        }
    }

}
