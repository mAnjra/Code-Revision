public class BoundedCounter{
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next(){
        if(this.value >= this.upperLimit ){//this is where the value resets(to 0) if it hits the upperLimit
            this.value = 0;
        }else{
            this.value +=1;
        }   
    }
    
    public void setValue(int value){
        if(this.value >=0){
            if(this.upperLimit >= this.value){
            this.value = value;
        } 

        }
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        if(this.value<10){
            return "0"+ value;
        }
        return ""+ value;

        
    }








}
