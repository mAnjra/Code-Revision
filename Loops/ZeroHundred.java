public class ZeroHundred{

    public static void main(String[] args){

        // 0 TO 100
        int i;
        for(i=0;i<=100;i++){
            System.out.println(i);
        }

        //100 TO 0
        for(i=100; i>=0;i--){ // if i is less than 100 which it is at this moment, then print it, when the condition fails thats when the loop ends.
            System.out.println(i);
        }
        
        //WHILE LOOP - 0 - 100
        int e = 0;
        while(e<=100){
            System.out.println(e);
            e++;
        }
    }
}
