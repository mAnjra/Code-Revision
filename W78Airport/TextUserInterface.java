package Airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TextUserInterface {
    private Airplane airplane = new Airplane();
    private Scanner scan = new Scanner(System.in);
    private ArrayList<String> completedFlight;

    public TextUserInterface(Scanner scan, Airplane airplane){
        this.airplane = airplane;
        this.scan = scan;
        this.completedFlight = new ArrayList<>();
    }

    public void airportPanel(){
        System.out.println("Airport panel\n"+"---------------------");
        while(true){
            System.out.print("Choose operation:\n"+"[1] Add airplane\n"+"[2] Add flight\n"+"[x] Exit\n"+"> ");
            String answer = scan.nextLine();
            if(answer.equals("x")){
                break;
            }else if (answer.equals("1")) {
                addPlane();
            }else if (answer.equals("2")){
                addFlight();
            }
        }
    }

    public void flightService(){
        System.out.println("Flight service\n"+"---------------------");
        while(true){
            System.out.print("Choose operation:\n"+"[1] Print planes\n"+"[2] Print Flights\n"+"[3] Print plane info\n"+"[x] Exit\n"+"> ");
            String answer = scan.nextLine();
            if(answer.equals("x")){
                break;
            }else if (answer.equals("1")){
                airplane.printAllPlanes();
            }else if (answer.equals("2")){
                printFlights();
            }else if (answer.equals("3")) {
                printPlaneInfo();
            }
        }
    }

    private void printFlights() {
        this.completedFlight.stream().forEach(System.out::println);
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = airplane.getPlane(scan.nextLine());
        System.out.println(planeID);
    }

    private void addPlane() {
        System.out.print("Give plane ID: "); //HA-LOL
        String id = scan.nextLine();
        System.out.print("Give plane capacity: "); // 42
        String seats = scan.nextLine();
        airplane.addPlane(id, id+" ("+seats+" ppl)"); // puts into hashmap
    }

    private void addFlight() {
        System.out.print("Give Plane ID: ");
        String planeID = airplane.getPlane(scan.nextLine());

        System.out.println("Give departure airport code: ");
        String dep = scan.nextLine(); // departure code
        System.out.println("Give destination airport code: ");
        String des = scan.nextLine(); // destination code

        String flightCode = "("+dep+"-"+des+")";
        completedFlight.add(planeID+" "+flightCode);

    }

}
