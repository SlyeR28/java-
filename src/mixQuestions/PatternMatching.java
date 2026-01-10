package mixQuestions;

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = 123;

        switch (obj){
            case String s -> System.out.println("String in switch : " + s.toUpperCase());
            case Integer i-> System.out.println("Integer in switch case : " + (i+1));
            case null -> System.out.println("Its null");
            default -> System.out.println("other type");
        }
    }
}
