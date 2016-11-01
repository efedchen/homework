package Polymorphism.Homework.Developers;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Developer[] list = {
				new JuniorDeveloper("Mike", 500, 0),
				new JuniorDeveloper("Dima", 500, 1),
				new JuniorDeveloper("Vova", 500, 2),
				new SeniorDeveloper("Jack", 500, 5),
				new TeamLeadDeveloper("Robby", 500, 7),
				new TeamLeadDeveloper("Kate", 500, 6),
                new Intern ("Arthur", 250, 0),
		};
		StringBuilder sb;
		
		for (Developer d : list) {
			sb = new StringBuilder() // !!!
				.append(d.getName())
				.append(": ")
				.append(d.getBasicSalary())
				.append(" -> ")
				.append(d.getSalary());
			
			System.out.println(sb.toString());
		}
        System.out.println("____________________");
// print name of the developers that have salary higher than 1500
        for(Developer d : list){
            if(d.getSalary()>1500){
                System.out.println("Developer with salary higher than 1500: "+ d.getName());
            }
        }
        System.out.println("____________________");
//refine the list with the developers to 3 different lists - for Juniors, seniors, teamLeads
        ArrayList <Developer> jDev = new ArrayList<>();
        ArrayList <Developer> sDev = new ArrayList<>();
        ArrayList <Developer> tlDev = new ArrayList<>();

        for (Developer d : list){
            if(d instanceof JuniorDeveloper)
                jDev.add(d);
            if(d instanceof  SeniorDeveloper)
                sDev.add(d);
            if(d instanceof  TeamLeadDeveloper)
                tlDev.add(d);
        }
        for(Developer d : jDev){
            System.out.println("Juniordev " +d.getName());
        }
        for(Developer d : sDev){
            System.out.println("Seniordev " +d.getName());
        }
        for(Developer d : jDev){
            System.out.println("TeamLead " +d.getName());
        }
        System.out.println("____________________");
    }
}
