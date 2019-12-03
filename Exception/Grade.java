public class Grade {
    private int grade;

    public Grade(int grade){
        // This is done in the grade exception
        if(grade < 0 || grade > 5){
            throw new IllegalArgumentException("Grades are between 0 - 5");
        }
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }
}
