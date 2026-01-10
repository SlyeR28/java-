package ExceptionHandling;

import java.sql.SQLException;

public class MultipleException {
    public static void main(String[] args) {

        try{
            throw new SQLException();
        } catch (SQLException | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
// catch(e1 || e2)