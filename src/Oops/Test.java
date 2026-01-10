package Oops;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("blue" , "tata" , "2025" , 100 , 4);
        car.accelerate(30);
        System.out.println(car);
    }
}
