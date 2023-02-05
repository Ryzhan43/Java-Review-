import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("******************************");
        //Print aa emails - One wmployee has one email - One to one
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all emeils
        System.out.println("*************** Print all emeils ***************");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("*************** Print all phone numbers ***************");
        EmployeeData.readAll()
                .flatMap( employee -> employee.getEmpPhneNumber().stream())
                .forEach(System.out::println);

        System.out.println("\n******************** TASK1 ********************");
        List.of(1,2,3,4,5,6,7,121).stream()
                .map((Integer a) -> Math.pow(a,2))
                .forEach(System.out::println);

//        //
//        System.out.println("\n******************** TASK2 ********************");
//        List<Integer> list1 = Arrays.asList(1,2,3);
//        List<Integer> list2 = Arrays.asList(3,4);
//        List<int[]> pairs = list1.stream()
//                .flatMap(l1->list2.stream()
//                        .flatMap(l2->Arrays.stream()


    }

}


