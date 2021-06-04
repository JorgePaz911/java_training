package Day2;

abstract class Test1{
    public abstract void display();
}
abstract class Test2 extends Test1{
    public abstract void display2();
}
abstract class Test3 extends Test2{
    public abstract void display3();
}

class TestAll extends Test3{

    @Override
    public void display() {

    }

    @Override
    public void display2() {

    }

    @Override
    public void display3() {

    }
}


public class ChainAbstract {
    public static void main(String[] args) {

    }
}
