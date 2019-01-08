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


}