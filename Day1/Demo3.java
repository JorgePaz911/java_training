package Day1;


class TestDemo3{
    public TestDemo3() {
        System.out.println("const1");
    }

    public TestDemo3(int x) {
        System.out.println("const2 " + x);
    }

    public void print(){
        System.out.println("printing...");
    }

}

public class Demo3 {

    public static void main(String[] args) {
        TestDemo3 td3 = new TestDemo3();
        TestDemo3 td3_2 = new TestDemo3(5);
        td3.print();
        td3_2.print();
    }
}
