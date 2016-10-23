package UsageOOP.HomeworkOOP;

import java.util.Calendar;
import java.util.Date;

public class StudentList {
    private Student [] list = new Student[4];
    private int counter=0;

    public void add(Student st){
        list [counter++]=st;
    }

    public Student get(int number){
        return list[number];
    }

    //searches for the student by name
    public int find(String name){
        for (int i = 0; i < counter; i++) {
            if(list[i].getName().equalsIgnoreCase(name))
                return i;
        } return -1;
    }

    public int findSurname(String surname){
        for (int i = 0; i < counter; i++) {
            if(list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        } return -1;
    }

    public int findBirthday(Date birthday){
        for (int i = 0; i < counter; i++) {
            if(list[i].getBirthday().equals(birthday))
                return i;
        } return -1;
    }
}
