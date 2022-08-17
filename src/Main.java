import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        City sity1 = new City(9, "Bishkek");
        City sity2 = new City(7, "Moskow");
        City sity3 = new City(3, "Berlin");
        City sity4 = new City(4, "London");
        City sity5 = new City(5, "Paris");
        City sity6 = new City(1, "Madrid");
        Set<City> tree1 = new HashSet<>();
        Set<City> tree = new TreeSet<>();
        tree1.add(sity1);
        tree1.add(sity2);
        tree1.add(sity3);
        tree1.add(sity4);
        tree1.add(sity5);
        tree1.add(sity6);

        for (City a : tree1) {
            if (a.getCode() % 2 == 1) {
               tree.add(a);

            }
        }System.out.println(tree);

    }
}