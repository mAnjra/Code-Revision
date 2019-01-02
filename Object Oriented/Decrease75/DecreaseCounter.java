public class DecreaseCounter{
   private int value;
   private int initialValue;

   public DecreaseCounter(int valueAtStart){
       this.value = valueAtStart;
       initialValue = this.value;//for the setToInitial method
   }

   public void print(){
        System.out.println("Value: "+ this.value);
   }

   public void decreaseValue(){//75.2
    if(this.value>0){
       this.value -= 1;  
    }  
   }
   
   public void reset(){//75.3
       this.value = 0;
   }  
   
   public void setToInitial(){//75.4
        this.value = initialValue;
   }  
}
