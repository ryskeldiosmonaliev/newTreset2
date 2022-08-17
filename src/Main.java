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

        Set<City> tree = new TreeSet<>(City.cityComparator);
        tree.add(sity1);
        tree.add(sity2);
        tree.add(sity3);
        tree.add(sity4);
        tree.add(sity5);
        tree.add(sity6);

        for (City c : tree) {
            if (c.getCode() % 2 == 1) {
                System.out.println(c);
            }
        }
    }
}