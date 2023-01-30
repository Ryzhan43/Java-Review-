package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(400).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(150).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(400).color(Color.RED).build());

        OrangeFormatter simpleFormatter = orange -> "An apple of " + orange.getWeight()+ "g;";
        prettyPrintApple(inventory,simpleFormatter);
        prettyPrintApple(inventory, orange -> "An " + (orange.getWeight()>200 ? "Light" : "Heavy") + " " + orange.getColor().toString() + " orange");
    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange: inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}

