package Polymorphism.Homework.Developers;

public class Intern extends Developer {

    public Intern (String name, double basicSalary, int experience){
        super(name,basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
