package Day2;


abstract class Calculator{

    public void addNum(int n1, int n2){
        System.out.println(n1 + n2);
    }

    public void subNum(int n1, int n2){
        System.out.println(n1 - n2);
    }

    public abstract void mulNum(int n1, int n2);
    public abstract void divNum(float n1, float n2);
}

class TestCalc extends Calculator{

    @Override
    public void mulNum(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    @Override
    public void divNum(float n1, float n2) {
        System.out.println(n1 / n2);
    }
}


public class AbstractPractice2 {
    public static void main(String[] args) {
        TestCalc calc = new TestCalc();

        calc.addNum(10,5);
        calc.subNum(10,5);
        calc.mulNum(10,5);
        calc.divNum(10,5);
    }
}
