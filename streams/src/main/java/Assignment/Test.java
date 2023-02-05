package Assignment;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class Test {

    public static void main(String[] args) {

        //1. Find all transactions in the year 2011 and sort them by value(small to high)
        System.out.println("\n**************** Task 1 *************************");
        TransactionsData.getAll()
                .stream()
                .filter(year -> year.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);


        //2. What are all the unique cities where the traders work?
        System.out.println("\n************** Task 2 *************************");
        TransactionsData.getAll()
                .stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3. Find all traders from Cambridge and sort them by name
        System.out.println("\n**************** Task 3 *************************");
        TransactionsData.getAll()
                .stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //4. Return a string of all traders' names sorted alphabetically
        System.out.println("\n**************** Task 4 *************************");

        Optional<String> allTradersNamesSorted = TransactionsData.getAll()
                .stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce((a,b) -> a + " " + b);
        System.out.println(allTradersNamesSorted.get());

        //5. Any traders based in Milan
        System.out.println("\n**************** Task 5 *************************");
        String cityPredicate = "Cambridge";

        Optional<Transaction> isThereAnyTraderFrom =
                TransactionsData.getAll()
                        .stream()
                        .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase(cityPredicate))
                        .findAny();
        System.out.println(isThereAnyTraderFrom.equals(Optional.empty()) ? "There is no trader from " + cityPredicate
                                                                            : "Yes, There is a trader from " + cityPredicate);


        //6. Print the values of all transactions from the trades living in Cambridge
        System.out.println("\n**************** Task 5 *************************");
        String cityPredicate_Task6 = "Cambridge";

        TransactionsData.getAll()
                .stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase(cityPredicate))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7. What is the highest value of all the transactions
        System.out.println("\n**************** Task 7 *************************");

        Optional<Integer> maxValueOfAllTransactions =  TransactionsData.getAll()
                .stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(maxValueOfAllTransactions.get());

        //8. Find the transaction with the smallest value
        System.out.println("\n**************** Task 8 *************************");
        Optional<Integer> smallestTransactionValue  =  TransactionsData.getAll()
                .stream()
                .map(trans -> trans.getValue())
                .reduce(Integer::min);
        TransactionsData.getAll()
                .stream()
                .filter(transaction -> transaction.getValue()==smallestTransactionValue.get())
                .forEach(System.out::println);

        Optional<Transaction> smallval = TransactionsData.getAll().stream()
                .reduce((t1,t2) -> t1.getValue()<t2.getValue() ? t1 : t2);
        System.out.println(smallval);

        //SHORTCUT
        System.out.println(TransactionsData.getAll().stream().min(comparing(Transaction::getValue)));



    }


}
