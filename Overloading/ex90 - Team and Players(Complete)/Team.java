import java.util.ArrayList;
import java.util.Arrays;

public class Team{
    String name;
    ArrayList<Player> players = new ArrayList<Player>();
    int maxSize = 16;
    
    public Team(String name){
        this.name = name;
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return players.size();
    }

    public String getName(){
        return name;
    }

    public void addPlayer(Player name){
        if(players.size() < this.maxSize){
            players.add(name);
        }
        
    }

    public int goals(){
        int i = 0;
        for(Player player: players){
            i += player.getGoals();
        }

        return i;
    }

    public void printPlayers(){
        System.out.println(Arrays.toString(players.toArray())); 
    }
}