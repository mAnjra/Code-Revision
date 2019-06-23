public class Main {

    public static void main(String[] args) {
        NightSky nightSky = new NightSky(0.2,8, 4);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());

        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
    }
}