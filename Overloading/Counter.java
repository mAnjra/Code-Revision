public class Counter{
    private int number;
    private boolean check;

    public Counter(int number, boolean check){
        this.number = number;
        this.check = check;
    }

    public Counter(int number){
        this(number, false);
    }
    public Counter(boolean check){
        this(0, check);
    }

    public Counter(){
        this(0, false);
    }

    public int value(){
        return this.number;
    }

    public void increase(){
        this.number += 1;
    }

    public void decrease(){
        if(this.check == true){
            if(this.number!=0){
                this.number -= 1;
            }
        }else{
            this.number -= 1; 
        }
    }





}
