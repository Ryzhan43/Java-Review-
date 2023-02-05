package Assignment;

import java.util.List;

public class TransactionsData {
    static public List<Transaction> getAll(){
        return List.of(
                new Transaction(TraderData.brian, 2011,300),
                new Transaction(TraderData.rauol, 2012,100),
                new Transaction(TraderData.rauol, 2011,400),
                new Transaction(TraderData.mario, 2011,300),
                new Transaction(TraderData.mario, 2012,700),
                new Transaction(TraderData.alan, 2012,950)
        );
    }
}
