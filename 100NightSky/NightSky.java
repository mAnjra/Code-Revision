import java.util.Random;

public class NightSky {

    double density;
    int width;
    int height;
    int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random rand = new Random();

        for (int i = 0; i < width; i++) {// we are printing stars here, but just using random to decide wether to print
                                         // space or a star
            if (rand.nextDouble() < density) {// the higher the density the more stars. nextDouble gets a random number between 0.0 - 1.0 
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print(){
        starsInLastPrint = 0;
        for(int i = 0; i < height; i++){
            printLine();// we can already print a line, we now do it for multiple
            System.out.println();
        }
    }

    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}