package Ex19MethodArgValidation;

public class Person {

    private String name;
    private int age;

    public Person (String name, int age){
        if( name.equals("") || name.length() > 40 || name == null || age < 0 || age > 120){
            throw new IllegalArgumentException("");
        }
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public  int getAge(){
        return this.age;
    }
}
