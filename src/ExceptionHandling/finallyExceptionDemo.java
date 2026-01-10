package ExceptionHandling;

public class finallyExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Exception from try");
        }catch (Exception e){
            throw new RuntimeException("Exception from catch");

        }finally {
   throw new RuntimeException("Exception from finally");
        }
    }
}
