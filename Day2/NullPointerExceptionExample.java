package Day2;

class Test5{
    public void display(){
        System.out.println("display method");
    }
}

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // NullPointerException
        //RuntimeException -> Exception -> Throwable

        String str = "Mark";
        System.out.println(str.length());

        Test5 t1 = new Test5();
        t1.display();

        Test5 t2 = null;

        try {
            t2.display();
        }catch(NullPointerException npe){
            System.out.println("NPE");
        }

    }
}
