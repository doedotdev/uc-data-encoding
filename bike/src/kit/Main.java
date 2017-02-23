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


        // Statics
        System.out.println("Collection Test");

        LinkedList<bike> list2 = new LinkedList<>();
        list2.add(object);
        list2.add(new_bike_object);
        for (bike o : list2){
            o.printBikeStats();
            System.out.println("---");
        }
        System.out.println("Size: " + list2.size());
        System.out.println("Size: " + list2.get(0));

        Hashtable<String, Integer> my_table = new Hashtable<>();
        String[] my_str = new String[20];
        for(int i = 0; i < 20; i++){
            my_table.put(Integer.toString('a' + i), i);
        }
        my_table.put("hello", 123456);

        Integer n = my_table.get("hello");
        if(my_table.containsKey("hello")){
            my_table.put("hello", 3);
        }
        System.out.println(n);

        System.out.println("---");
        System.out.println("---");
        System.out.println("---");
        System.out.println("---");
        System.out.println("---");
///////////////////////////////////////////////////////////////////////////
        HashMap<String, Integer> my_map = new HashMap<>();
        String[] my_strings = {"hello", "how", "are", "you", "hello", "", "", ""};
        for(int i = 0 ; i < my_strings.length; i++){
            if(my_map.containsKey(my_strings[i])){
                my_map.put(my_strings[i], my_map.get(my_strings[i])+1); // increment ocurence values
            }
            else{ // keuy does not exist yet
                my_map.put(my_strings[i], 1);
            }
        }
        //
        Iterator it = my_map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
    }
}
