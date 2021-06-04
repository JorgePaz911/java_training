package Day1;

class Parent{
    int one;
    int two;

    public Parent(int one, int two) {
        this.one = one;
        this.two = two;
    }
    public void display(){
        System.out.println("In Parent");
    }
}

class Child extends Parent{

    int three;
    public Child(int one, int two, int three) {
        super(one, two);
        this.three = three;
    }

    public void display(boolean a){
        System.out.println(one + " " + two + " " + three);
    }
    public void display(int a){
        System.out.println("int");
    }
    public void display(String a){
        System.out.println("String");
    }
    public void display(int a, String b){
        System.out.println("int and String");
    }
    public void display(){
        System.out.println("overriding");
    }
}

class Child2 extends Parent{

    public Child2(int a, int b){
        super(a,b);
    }

    public void display(){

    }

}


public class Inheritance2 {

    public static void main(String[] args) {
        Child c = new Child(1,2,3);
        Parent p = new Parent(5,6);
        //c.display();
        //c.display2();

        c.display();
//        c.display(6);
//        c.display(false);
//
//        p.display();

    }

}
