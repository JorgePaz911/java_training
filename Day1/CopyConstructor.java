package Day1;

class Copy1{
    int att1;
    String att2;
    boolean att3;

    public Copy1(int att1, String att2, boolean att3) {
        this.att1 = att1;
        this.att2 = att2;
        this.att3 = att3;
    }

    public Copy1(Copy1 copy) {
        this.att1 = copy.att1;
        this.att2 = copy.att2;
        this.att3 = copy.att3;
    }

    @Override
    public String toString() {
        return "Copy1{" +
                "att1=" + att1 +
                ", att2='" + att2 + '\'' +
                ", att3=" + att3 +
                '}';
    }
}



public class CopyConstructor {
    public static void main(String[] args) {
        Copy1 copy = new Copy1(5, "5", false);
        Copy1 copy2 = new Copy1(copy);
        copy2.att3 = true;

        System.out.println(copy.toString());
        System.out.println(copy2.toString());
    }
}
