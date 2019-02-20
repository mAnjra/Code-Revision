public class Reformatory{
    private int counter;
    public int weight(Person person){
        this.counter++;
        return person.getWeight();
    }
    public void feed(Person person){
        //int i = 1 + person.getWeight();
        //person.setWeight(i);
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return this.counter;
    }
}