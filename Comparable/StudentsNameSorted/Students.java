package StudentsNameSorted;

public class Students implements Comparable<Students>{
    private String name;

    public Students(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Student name: "+ this.name;
    }

    @Override
    public int compareTo(Students o) {
        // is this name is greater than name passed in you will get positive number
        // if thsi name is less than name passed in you will get negative number
        // if the name passed in is the same then you will get 0
        return this.name.compareToIgnoreCase(o.getName()); // string has its own compareTo method and compareTo ignore case method
    }
}
