package hashCode;

public class Person {
    private int age;
    private String name;
    private String surName;
    private String placeOfBirth;

    public Person(int age, String name, String surName, String placeOfBirth) {
        this.age = age;
        this.name = name;
        this.surName = surName;
        this.placeOfBirth = placeOfBirth;
    }
    @Override
    public int hashCode(){
        int result = age;
        result = 31*result+name.hashCode();
        result = 31*result+surName.hashCode();
        result = 31*result+placeOfBirth.hashCode();
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Person p = (Person) obj;
        if (age != p.age)
            return false;
        if (name != p.name)
            return false;
        if (surName != p.surName)
            return false;
        if (placeOfBirth != p.placeOfBirth)
            return false;
        return true;
    }
}
