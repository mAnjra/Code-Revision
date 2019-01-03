import java.util.ArrayList;

public class Menu{
    
    private ArrayList<String> meals;

    public Menu(){//this constructor creates a blank array list. 
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String name){
        if(!meals.contains(name)){
            meals.add(name);//dont need to add 'this.' here, as this is a list any changes made in this method will work all round  
        }
    }

    public void printMeals(){
        for(String s: meals){
            System.out.println(s);
        }
    } 
    
    public void clearMenu(){
        meals.clear();
    }
}