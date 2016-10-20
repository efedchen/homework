package UsageOOP.HomeworkOOP;

/**
 * Class that counts his own instances
 */
public class CounterClass {
    public static void main(String[] args) {
        CounterInstance cI1 = new CounterInstance();
        CounterInstance cI2 = new CounterInstance();
        CounterInstance cI3 = new CounterInstance();

        System.out.println(CounterInstance.counter);
    }
}
