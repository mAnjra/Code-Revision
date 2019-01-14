public class PersonMain {
    public static void main(String[] args) {
       Person bob = new Person("Bob");
       Person andy = new Person("Andy");
       
       bob.setheight(180);
       bob.setWeight(86);

       andy.setheight(175);
       andy.setWeight(64);

       System.out.println(bob.getName() + ", body mass index: " + bob.bodyMassIndex());
       System.out.println(andy.getName()+ ", body mass index: " + andy.bodyMassIndex());




/*
       int i = 0;
       while(i <30){
           bob.becomeOlder();
           i++;
       }

       andy.becomeOlder();
       System.out.println("");

       if(andy.isAdult()){
           System.out.println(andy.getName() + " is an Adult");
       }else{
           System.out.println(andy.getName() + " is a Minor");
       }

       if(bob.isAdult()){
           System.out.println(bob.getName() + " is an Adult");
       }else{
           System.out.println(bob.getName() + "is a Minor");
       }*/

    }     
}
