package UsageOOP.HomeworkOOP;

/**
 *  create class "automobile" that could start the machine,
 *  turn off the motor, move, and keep the speed
 */
public class Automobile {

    private boolean startEngine;  //automatically initialized "false"
    private boolean autoPilot;
    private int speed;
    private String model;
    private double engineCapacity;
    private double distance;
    private double consumedFuel;
    public Automobile(String model, double engineCapacity){
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public void EngineStatus(boolean strEng){
        this.startEngine=strEng;
        if(startEngine==true){
        System.out.println(model+ " is started!");
        }else{
            System.out.println(model+"'s engine is turned off!");
        }
    }

    public void Moves (int spd) {
        this.speed=spd;
        System.out.println(model+ " moves with " + speed + " km/hour");
    }

    //auto pilot could keep the speed
    public void StartAutoPilot(boolean act){
        if(act == true){autoPilot = true;
            System.out.println("Autopilot is turned on.");
        }else {autoPilot = false;
            System.out.println("autopilot is turned off!");}
    }

    //actually that equation doesnt calculates the volume of consumed fuel
    //but whatever
    public double ConsumedFuel (double dist) {
        this.distance = dist;
        consumedFuel=dist*engineCapacity;
        return consumedFuel;
    }

}
