package NationalService;

public class MilitaryService implements NationalService {
    private int daysLeft;
    private int storedDaysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
        this.storedDaysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if(this.daysLeft==0){
            this.daysLeft = this.storedDaysLeft;
        } else this.daysLeft -= 1;

    }
}
