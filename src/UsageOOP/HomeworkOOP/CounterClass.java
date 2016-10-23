package UsageOOP.HomeworkOOP;

/**
 * Class that counts his own instances
 */
public class CounterClass {
    public static void main(String[] args) {
        counterInstance cI1 = new counterInstance();
        counterInstance cI2 = new counterInstance();
        counterInstance cI3 = new counterInstance();

        System.out.println(counterInstance.counter);
    }
}
