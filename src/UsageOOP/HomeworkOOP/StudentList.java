package UsageOOP.HomeworkOOP;

import java.util.ArrayList;
import java.util.Date;

public class StudentList {
//    private Student [] list = new Student[4];
    private ArrayList<Student> list = new ArrayList<>();
    private int counter=0;

    public void add(Student st){
        list.add(counter++,st);
        //list [counter++]=st;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public Student get(int number){
        return list.get(number);
//        return list[number];
    }

    //searches for the student by name
    public int find(String name){
        for (int i = 0; i < counter; i++) {
//            if(list[i].getName().equalsIgnoreCase(name))
              if(list.get(i).getName().equalsIgnoreCase(name))
                return i;
        } return -1;
    }

    public int findSurname(String surname){
        for (int i = 0; i < counter; i++) {
//            if(list[i].getSurname().equalsIgnoreCase(surname))
            if(list.get(i).getSurname().equalsIgnoreCase(surname))
                return i;
        } return -1;
    }

    public int findBirthday(Date birthday){
        for (int i = 0; i < counter; i++) {
//            if(list[i].getBirthday().equals(birthday))
            if(list.get(i).getBirthday().equals(birthday))
                return i;
        } return -1;
    }

//    public void delStudent(String surname){
//        for (int i = 0; i < counter; i++) {
//            if(list.get(i).getSurname().equalsIgnoreCase(surname)){
//                //int count=+i;
//                list.remove(i);
//                break;
//            }
//        }System.out.println("There is no student with such surname.");
//    }
    public int delStudent(String surname){
        for (int i = 0; i < counter; i++) {
            if(list.get(i).getSurname().equalsIgnoreCase(surname))
                return i;
        }return -1;
    }
}
