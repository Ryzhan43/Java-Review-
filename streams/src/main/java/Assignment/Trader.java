package Assignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trader {
    private String name;
    private String city;

    @Override
    public String toString() {
        return "Trader: " +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '.';
    }
}
