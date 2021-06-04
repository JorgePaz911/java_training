package Day2;

public class PipeExceptions {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        String d = null;

        try {
            c = a / b;
            d.length();
        } catch (ArithmeticException ae) {
            System.out.println("arithmetic");
        }
        catch (NumberFormatException | NullPointerException nfe){
            System.out.println("null ex or number ex");
        }
        catch (Exception exc){
            System.out.println("Final Exception");
        }
    }
}
