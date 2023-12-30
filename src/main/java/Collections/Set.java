package Collections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();
        names.add("Andrew");
        names.add("Britney");
        names.add("John");
        names.add("Kevin");
        names.add("Igor");
        names.add("Venice");
        names.add("Leo");
        names.add("David");
        names.add("Peter");
        System.out.println(names);
        if(names.contains("Walter")){
            System.out.println("В коллекции есть имя Walter");
        }
        System.out.println("_____________________________________\n");

        HashSet<String> linkedNames = new LinkedHashSet<>();
        linkedNames.add("Andrew");
        linkedNames.add("Britney");
        linkedNames.add("John");
        linkedNames.add("Walter");
        linkedNames.add("Walter");
        System.out.println(linkedNames);
        System.out.println("_____________________________________\n");

        TreeSet<String> treeSetNames = new TreeSet<>();
        treeSetNames.add("Andrew");
        treeSetNames.add("Britney");
        treeSetNames.add("John");
        treeSetNames.add("Alexey");
        treeSetNames.add("Walter");
        treeSetNames.add("Walter");
        System.out.println(treeSetNames);
    }
}
