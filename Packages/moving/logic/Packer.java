package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private final int boxesVolume;
    private final List<Box> boxes;

    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<>();
    }

    public List<Box> packThings(List<Thing> things){

        for(Thing t : things){
            Box box = new Box(this.boxesVolume);
            box.addThing(t);
            boxes.add(box);
        }
        return this.boxes;
    }
}
