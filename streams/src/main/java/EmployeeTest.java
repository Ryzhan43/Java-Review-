import java.util.List;

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
                .flatMap(employee -> employee.getEmpPhneNumber().stream())

                .forEach(System.out::println);

        System.out.println("\n******************** TASK1 ********************");
        List.of(1,2,3,4,5,6,7,121).stream()
                .map((Integer a) -> Math.pow(a,2))
                .forEach(System.out::println);
    }

}


