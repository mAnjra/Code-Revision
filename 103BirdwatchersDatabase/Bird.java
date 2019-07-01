public class Bird {

    int obeservation = 0;
    String name;
    String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public void addBird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return this.name;
    }

    public String statistics() {
        return this.name + " (" + this.latinName + ") : " + this.obeservation + " observation";
    }

    public void increaseOb(){
        this.obeservation++;
    }

}