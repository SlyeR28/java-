package mixQuestions;

//Can you override a private method in a subclass
public class OverridePrivate {
    private void show(){
        System.out.println("Showing Override Private method()");
    }
}
class ClassSecond extends OverridePrivate {
    private void show(){
        System.out.println("Class Second override method()");
    }
}

