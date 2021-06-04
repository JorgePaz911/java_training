package Day2;



class TestException2 extends RuntimeException{

    public TestException2(){
        System.out.println("Exception running");
    }

}

public class Exception1 {
    public static void main(String[] args) {

        int a = 10;
         int b = 1;
         int c = 7;

         try {
             c = a / b;
         }catch(ArithmeticException ae){
             System.out.println("Arithmetic Problem");
             ae.printStackTrace();
             System.exit(1);
         }
        System.out.println(c);

        throw new TestException2();


    }
}
