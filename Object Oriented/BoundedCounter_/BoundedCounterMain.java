public class BoundedCounterMain {
    public static void main(String[] args) throws Exception {//in order for the thread to sleep(here its sleeps for a second)
        //Scanner scan = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hour = new BoundedCounter(23);
/*
        System.out.println("Seconds: ");
        int s = Integer.parseInt(scan.nextLine());
        System.out.println("Minutes: ");
        int m = Integer.parseInt(scan.nextLine());
        System.out.println("Hours: ");
        int h = Integer.parseInt(scan.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hour.setValue(h);

*/
        
        int i = 0;
        while (true) {
            System.out.println(hour + ":" + minutes+":"+seconds);
           // minutes.next();
           Thread.sleep(1000);
            seconds.next();
            
            if(seconds.getValue()==0){
                minutes.next();
            }
            if(minutes.getValue()==0&&seconds.getValue()==0){
                hour.next();
            }
            i++;
            if(hour.getValue()==1){break;}
        }
    }

}
