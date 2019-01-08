public class Person{
    private String name;
    private int age;

    public Person(String name){
        
        this.name = name;
        this.age = 0;
    }

    public void printPerson(){
        System.out.println(this.name + ", age" + this.age + " years");
    }

    public void becomeOlder(){
        this.age += 1;
    }

    public boolean isAdult(){
        return this.age>=18;

        /*It can also be done this way - slightly verbose
        if(this.age<18){
            return false
        }

        return true
        */
    }

    public String getName(){
        return this.name;
    }
    
      public String toString(){
        return "Name: "+this.name + " Age: "+ this.age;
          /*
          instead of printing it it returns the string representation of the object
          also in main the you can simply type sysou...andy and leave out the toString
          as java automatically completes that at runtime. the object asks for its string representation
          at runtime and looks for a toString.
          */
         
    }


}
