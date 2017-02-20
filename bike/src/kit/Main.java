package kit;

import java.util.*;


public class Main extends bike {

    public static void main(String[] args) {
        bike object = new bike(62, 22, 30, "black", "trek");
        object.printBikeStats();

        mtnbike new_bike_object = new mtnbike(62, 22, 30, "black", "trek");
        new_bike_object.printBikeStats();
        System.out.println("--");
        new_bike_object.printMtnBikeStats();

        // Statics
        System.out.println("Collection Test");

        List<bike> list = new ArrayList<>();
        list.add(object);
        list.add(new_bike_object);
        for (bike o : list){
           o.printBikeStats();
           System.out.println("---");
        }
        System.out.println("Size: " + list.size());
        System.out.println("Size: " + list.get(0));
    }
}
