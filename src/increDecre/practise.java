package increDecre;

public class practise {
    public static void main(String[] args) {
//        int a = 5;
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);

        int a = 5;
        int b = a++ + ++a;
        System.out.println(a + " " + b);

        int x = 10;
        System.out.println(x++ + x++ + ++x);

//        int i = 1;
//        i = i++ + ++i;
//        System.out.println(i);

//        for (int i = 0; i < 5; i++) {
//            System.out.print(i++ + " ");
//        }

        int i = 0;
        while (i++ < 3) {
            System.out.print(i + " ");
        }




    }
}

/*
 a--
 --a  work same when you just using the variables only onces
 a++
 a++  work same

 a++ -> post-increment / post-prefix -> first uses the value then increment by 1
 ++a -> pre-increment / pre-prefix -> first increments the value by 1 then take its uses

 */