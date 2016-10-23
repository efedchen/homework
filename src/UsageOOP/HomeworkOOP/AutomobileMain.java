package UsageOOP.HomeworkOOP;

/**
 *  create class "automobile" that could start the machine,
 *  turn off the motor, move, and keep the speed
 */
public class AutomobileMain {
    public static void main(String[] args) {
        Automobile bmw = new Automobile("BMW 5", 1.8);
        Automobile audi = new Automobile("Audi A3", 2);

        bmw.engineStatus(true);
        bmw.engineStatus(false);
        bmw.engineStatus(true);
        bmw.moves(45);

        audi.engineStatus(true);
        audi.moves(65);

        bmw.startAutoPilot(true);
        audi.startAutoPilot(true);

        System.out.println(audi.consumedFuel(120));
        System.out.println(bmw.consumedFuel(300));

        bmw.startAutoPilot(false);
        audi.startAutoPilot(false);

        bmw.engineStatus(false);
        audi.engineStatus(false);
    }
}
