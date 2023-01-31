package comparatorInterface;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.management.ConstructorParameters;

@Data
@AllArgsConstructor
public class Apple {
    private int weight;
    private Color color;
}
