package ExceptionHandling;

public class TryBlockNesting {
    public static void main(String[] args) {
        try {
            // parent try block
            try {
                // child try block
                int b = 0;
                int c = 1 / b; // it will throw ArithmeticException
            }catch (ArithmeticException e){
                System.out.println("Caught Arithmetic Exception inside child try block");
            }
            int [] a = new int[0];
            System.out.println(a[1]); // throw array index out of exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in parent try block");

        }
    }
}
