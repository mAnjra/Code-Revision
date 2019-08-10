package Airport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Airplane plane = new Airplane();

        TextUserInterface ui = new TextUserInterface(reader, plane);
        ui.airportPanel();
        ui.flightService();
    }
}
