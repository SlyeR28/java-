package Strings;

public class TestString {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");
        String c = "abc";
        String d = "abc";
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        String name = "R";
        String name2 = "Ri";
        System.out.println(name2.compareTo(name));
    }
}
