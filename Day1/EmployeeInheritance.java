package Day1;

class Employee{
    String name;
    String email;

    public void showDetails(){
        System.out.println(name + " " + email);
    }
}

class FullEmployee extends Employee{
    public int fteSalary;

    public void showDetails(){
        System.out.println(name + " " + email + " " + fteSalary);
    }
}

class PartEmployee extends Employee{
    int pteSalary;
}

public class EmployeeInheritance {

    public static void main(String[] args) {
        FullEmployee fte = new FullEmployee();
        PartEmployee pte = new PartEmployee();

        fte.name = "fte";
        fte.email = "fte@fte.com";

        pte.name = "pte";
        pte.email = "pte@pte.com";

        fte.fteSalary = 10;
        fte.showDetails();
        pte.showDetails();
    }
}
