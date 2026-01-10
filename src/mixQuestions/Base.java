package mixQuestions;

public class Base {
    private void fun(){
        System.out.println("Base fun");
    }
}
class Dervide  extends Base{


    private void fun(){
        System.out.println("Derived fun...");
    }
    public static void main(String[] args) {
        Base ob = new Base();
//        ob.fun();
    }

}
