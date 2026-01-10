package ExceptionHandling;
// question is can we create try catch block without catch block
// ans -> we can create try catch block without catch block with finally block
public class trycatch {
    public static void main(String[] args) {

//           try{
//            System.out.println("Inside the catch block...");
//            System.exit(3); // if this comes anywhere system will exit
//        }catch (Exception e){
//            System.out.println("Inside catch block");
//        }finally {
//            System.out.println("inside finally block");
//        }
//
//        System.out.println("finally outside of every block");
        trycatch trycatch = new trycatch();
//        int test = trycatch.test();
//        System.out.println(test);

        System.out.println(trycatch.test2());
        // output wil be 1 b/c here we not return in the finally block we are just updating value


    }
    public int test(){
        try{
            return 1;
        }finally {
            return 2;
        }
    }

    public int test2(){
        int x = 0;
         try{
             x = 2;
             return  x;
         }finally {
             x = 5;
//               System.out.println("value of updated x is :" +x);
//             return x;

         }
    }

}
