package mixQuestions;

interface interfaceA{
    void method();
}

interface interfaceB{
    void method();
}

public class SameNameAndSignature  implements interfaceA , interfaceB{

    @Override
    public void method() {
        System.out.println("Implementing method");
    }

    public static void main(String[] args) {


    }
}
