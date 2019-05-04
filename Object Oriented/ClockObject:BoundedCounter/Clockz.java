public class Clockz{
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clockz(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning){
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);//according to class BoundedCounter the constructor requires an upper limit, here we have created it's limit

        //the 3 preceeding statements use the setValue method from boundedCounter to initiate the clock. The above lines create the objects
        //with the respective set limits
        hours.setValue(hoursAtBeginning); 
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
    }

    public void tick(){
        seconds.next();
        if(seconds.getValue()==0){
            minutes.next();
            if(minutes.getValue()==0){
                hours.next();
            }
        }
    }

    public String toString(){
        return hours+":"+minutes+":"+seconds;
    }
}