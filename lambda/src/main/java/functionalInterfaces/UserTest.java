package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> listOfUsers = new ArrayList<>();

        listOfUsers.add(User.builder().firstName("Mykyta").lastName("Ryzhan").age(12).build());
        listOfUsers.add(User.builder().firstName("Danilo").lastName("Ryzhan").age(21).build());
        listOfUsers.add(User.builder().firstName("Alex").lastName("Bi").age(26).build());
        listOfUsers.add(User.builder().firstName("John").lastName("Smith").age(23).build());
        listOfUsers.add(User.builder().firstName("Elton").lastName("John").age(36).build());
        listOfUsers.add(User.builder().firstName("Elon").lastName("Musk").age(23).build());

        //Print all elements in the list

//        print.accept(listOfUsers);
        filterUser(listOfUsers, a -> true);

        //Print all users that last n ame starts with E
        System.out.println("**************************");
        Predicate<User> startsWithE = user -> user.getFirstName().startsWith("E");

        filterUser(listOfUsers, startsWithE);

    }
    public static  <T extends User> void filterUser(List<T> users, Predicate<T> test){
        for(User o : users) {
            if(test.test((T)o)){
                System.out.println(o);
            }
        }
    }
}
