package Day2;

public class CommonExceptions {

    public static void main(String[] args) {

        int[] a = new int[2];
        try {
            System.out.println(a[4]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong index");
        }
        //System.out.println(a[4]);
        System.out.println("Hello");
    }
}
