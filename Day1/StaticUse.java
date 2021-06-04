package Day1;


class Calculator{

    public static int number;

    public void sum(int n1, int n2){
        System.out.println("Sum: " + (n1 + n2));
    }

    public static void sub(int n1, int n2){
        System.out.println("Sub: " + (n1 - n2));
    }

    public void callSub(int x, int y){
        Calculator.sub(x,y);
    }

    public void curNum(){
        System.out.println(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        Calculator.number = number;
    }
}


public class StaticUse {

    public static void main(String[] args) {
        Calculator.sub(10,50);


        Calculator cal = new Calculator();
        cal.sum(5,8);
        Calculator.number = 5;
        Calculator cal2 = new Calculator();

        cal.curNum();
        cal2.curNum();

        cal.setNumber(9);

        System.out.println(cal2.getNumber());

        cal.callSub(40,5);
    }

}
