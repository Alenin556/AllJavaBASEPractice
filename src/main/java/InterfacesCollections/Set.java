package InterfacesCollections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();
        names.add("Andrew");
        names.add("Britney");
        names.add("John");
        names.add("Walter");
        names.add("Walter");
        System.out.println(names);
        if(names.contains("Walter")){
            System.out.println("В коллекции есть имя Walter");
        }

        HashSet<String> linkedNames = new LinkedHashSet<>();
        linkedNames.add("Andrew");
        linkedNames.add("Britney");
        linkedNames.add("John");
        linkedNames.add("Walter");
        linkedNames.add("Walter");
        System.out.println(linkedNames);
    }
}
