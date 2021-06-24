package Day2;

interface IEmployee2{
    void print2();
}

interface IEmployee extends IEmployee2 {
    void print();
}

class Employee implements IEmployee{

    @Override
    public void print() {
        System.out.println("Interface Print..");
    }

    @Override
    public void print2() {
        System.out.println("Interface Print2..");
    }
}


public class InterfacePrac1 {
    public static void main(String[] args) {
        IEmployee emp = new Employee();
        emp.print();
        emp.print2();
    }
}
