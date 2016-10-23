package UsageOOP.HomeworkOOP;


import java.util.Date;

public class StudentBasic {
    public static void main(String[] args) {
        final StudentList stList = new StudentList();

        stList.add(new Student("Rafal","Kochanwski",new Date(1990, 2,10)));
        stList.add(new Student("Friend","Torwalds",new Date(1985, 5,4)));
        stList.add(new Student("Daniel","Rocket",new Date(1995, 2,9)));

        int searchName = stList.find("rafal");
        System.out.println("Search by name: "+
                stList.get(searchName).getBirthday().toString());

        int searchSurname = stList.findSurname("Torwalds");
        System.out.println("Search by surname: "+
                stList.get(searchSurname).getBirthday().toString());

        int searchBDate = stList.findBirthday(new Date(1990, 2, 10));
        System.out.println("Search by birth date: "+
                stList.get(searchBDate).getSurname().toString()+" "+
                stList.get(searchBDate).getName().toString());

    }
}
