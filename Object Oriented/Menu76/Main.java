public class Main{
    public static void main(String[] args){
          Menu burgers = new Menu();
          Menu chips = new Menu();
          
        burgers.addMeal("poo");
        chips.addMeal("flips");
        burgers.addMeal("poo");
        burgers.addMeal("goo");
        
        chips.clearMenu();
        burgers.clearMenu();
        burgers.printMeals();
        chips.printMeals();
    }
}