package Assignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private  Trader trader;
    private int year;
    private int value;

    @Override
    public String toString() {
        return "Transaction: " +
                "Trader Data =" + trader +
                ", year=" + year +
                ", value=" + value + "."
                ;
    }
}
