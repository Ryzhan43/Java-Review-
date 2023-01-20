package review;

import java.util.List;

public class MyUtils<T> {

    //Writing a method

    public static <T> void printInfo(List<T> items){
        for(T i : items){
            System.out.println(i.toString());
        }
        System.out.println(items.size());
    }

    public static <T> T lastItem (List<T> items) {
        return items.get(items.size()-1);
    }

    //Write a method that takes a list and returns the last item name of the list(Teacher, Student)
    //InstanceOf
    public static <T> String lastItemName(List<T> items) throws Exception {

        T lastItem = items.get(items.size() - 1);
        if(lastItem instanceof Student){
            return ((Student) lastItem).getName();
        } else if(lastItem instanceof Teacher){
            return ((Teacher) lastItem).getName();
        }else {
            throw new Exception("Not a valid type");
        }
    }

}
