public class PersonMain {
    public static void main(String[] args) {
       Person bob = new Person("Bob");
       Person andy = new Person("Andy");

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
       }
    }     
}
