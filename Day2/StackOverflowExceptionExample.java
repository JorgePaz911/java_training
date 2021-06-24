package Day2;

public class StackOverflowExceptionExample {

    public static void main(String[] args) {

        try{
            hello();
        }catch(StackOverflowError soe){
            System.out.println("Stack Overflowed");
        }

        System.out.println("Hello"); //Reaches here
    }

    static void hello(){
        while(true) hello();
    }
}
