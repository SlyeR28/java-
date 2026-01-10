package Oops;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    private String colour;
    private String brand;
    private String model;
    private int speed;
    private int years;

    public void accelerate(int increment){
     speed += increment;
    }

    public void brake(int decrement){
        speed -= decrement;
        if (speed<0){
            speed = 0;
        }
    }
}
