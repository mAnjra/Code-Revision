public class BoundedCounterMain {
    public static void main(String[] args) {

        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hour = new BoundedCounter(23);

        int i = 0;
        while (i < 121) {
            System.out.println(hour + ":" + minutes);
            minutes.next();
            //int t = minutes.getValue();
            if(minutes.getValue()==0){
                hour.next();
            }
            i++;
        }
    }

}
