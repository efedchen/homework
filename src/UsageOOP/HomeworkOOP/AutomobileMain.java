package UsageOOP.HomeworkOOP;

/**
 *  create class "automobile" that could start the machine,
 *  turn off the motor, move, and keep the speed
 */
public class AutomobileMain {
    public static void main(String[] args) {
        Automobile bmw = new Automobile("BMW 5", 1.8);
        Automobile audi = new Automobile("Audi A3", 2);

        bmw.EngineStatus (true);
        bmw.EngineStatus (false);
        bmw.EngineStatus (true);
        bmw.Moves(45);

        audi.EngineStatus (true);
        audi.Moves(65);

        bmw.StartAutoPilot(true);
        audi.StartAutoPilot(true);

        System.out.println(audi.ConsumedFuel(120));
        System.out.println(bmw.ConsumedFuel(300));

        bmw.StartAutoPilot(false);
        audi.StartAutoPilot(false);

        bmw.EngineStatus(false);
        audi.EngineStatus(false);
    }
}
