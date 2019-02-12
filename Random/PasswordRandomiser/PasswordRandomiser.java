import java.util.Random;

public class PasswordRandomiser{
    private Random random = new Random();
    private int passwordLength;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomiser(int passwordLength){
        this.passwordLength = passwordLength;
        this.random = new Random();
    }
    
    public String createPassword(){
        int loopIncrementer = 0;
        int charPosition;
        String password = "";
        while(loopIncrementer<passwordLength){
            charPosition = random.nextInt(alphabet.length());
            password += alphabet.charAt(charPosition);
            loopIncrementer++;
        }
        return password;
    }

}
