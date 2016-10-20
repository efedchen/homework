package UsageOOP.HomeworkOOP;

/**
 * class that counts his own instances
 */
public class CounterInstance {

    public static int counter; //that field is STATIC! that means that there is only
                               // one copy of that integer is in the program

    public CounterInstance (){
        counter++;
    }
}
