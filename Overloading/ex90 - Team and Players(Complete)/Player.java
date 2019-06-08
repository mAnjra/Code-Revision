

public class Player{
    String name;
    int goals;
    
    public Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }
    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getGoals(){
        return goals;
    }

    public String toString(){
        return "Player Name: "+ name + ", Goals: "+ goals;
    }

}