package mixQuestions;

class Parent{
    public static void staticMethod(){
        System.out.println("Parent's static method...");
    }

    public void add(){
        System.out.println("Parent add");
    }
}

class Child extends Parent{
    public static void staticMethod(){
        System.out.println("Child's static method...");
    }

    public void add(){
        System.out.println("child add");
    }
}

public class OverrideStaticMethod {

    static {
        System.out.println("Inise static block");
    }

    public static void main(String[] args) {
        Child parent = new Child();
        parent.staticMethod();
        parent.add();

    }
}
