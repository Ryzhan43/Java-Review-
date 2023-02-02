package review;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private String make;
    private int topSpeed;
    private int year;

}
