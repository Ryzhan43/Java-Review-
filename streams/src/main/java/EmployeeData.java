import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

        public static Stream<Employee> readAll(){
            return Stream.of(
                    new Employee(100,"Mike", "mike@cydeo.com", Arrays.asList("2002032123", "2023123141")),
                    new Employee(101,"Dame", "dame@cydeo.com", Arrays.asList("2312312312", "1213123213")),
                    new Employee(102,"Pope", "john@cydeo.com", Arrays.asList("1242151212", "12412213213")),
                    new Employee(103,"Adam", "adam@cydeo.com", Arrays.asList("2312312312", "44124124124"))
            );
            }
}
