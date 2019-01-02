public class DecreaseCounter{
   private int value;

   public DecreaseCounter(int valueAtStart){
       this.value = valueAtStart;
   }

   public void print(){
        System.out.println("Value: "+ this.value);
   }

   public void decreaseValue(){
    if(this.value>0){
       this.value -= 1;  
    }  
   }

}
