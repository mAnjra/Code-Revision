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


    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.number += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        int i = this.number - decreaseBy;
        if (this.check == true && decreaseBy >= 0) {
            if (i >= 0) {
                this.number -= decreaseBy;
            } else {
                this.number = 0;
            }
        } else {
            if (decreaseBy >= 0) {
                this.number -= decreaseBy;
            }
        }
    }


}
