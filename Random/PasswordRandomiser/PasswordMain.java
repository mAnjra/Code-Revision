public class PasswordMain{
    public static void main(String[] args){
        PasswordRandomiser randomiser = new PasswordRandomiser(13);
        System.out.println("Password: " + randomiser.createPassword());
        System.out.println("Password: " + randomiser.createPassword());
    }
}