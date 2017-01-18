package hashCode;

//own implementation of 'equals' and 'hashCode'

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(15,"John","Special","Honolulu");
        Person p2 = new Person(15,"John","Special","Honolulu");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
