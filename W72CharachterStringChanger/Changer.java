public class Changer{
    ArrayList<Change> changeList;

    public Changer(){
        this.changeList = new ArrayList<>();
    }

    public void addChange(Change change){
        this.changeList.add(change);
    }

    public String change(String characterString){
        for(Change c : changeList){
            characterString = c.change(characterString);
        }
        return characterString;
    }
}
