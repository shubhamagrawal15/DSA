package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Hashing {
    public static void main(String[] args) {
        // eg we are taking is country's population  --- country(key) population(value)
        HashMap<String,Integer> map = new HashMap<>();


        // Insertion Operation
        map.put("India",120);
        map.put("Us",30);
        map.put("China",150);

        System.out.println(map);

        map.put("China",180);

        System.out.println(map);

        // search/lookup operation
        if(map.containsKey("China")){
            System.out.println("present in the map");
        }else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));  //returns key doesnt exist


        // Iterate over the keys

       int[] arr={12,15,18};

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        for(int value:arr){
            System.out.print(value+"  ");
        }
        System.out.println();

        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.print(e.getKey()+":");
            System.out.print(e.getValue()+" ");
        }

        System.out.println(" ");

        Set<String> keys = map.keySet();

        for (String key : keys){
            System.out.print(key + " " + map.get(key) + " ");
        }
        System.out.println();
        // remove

        map.remove("China");
        System.out.println(map);

    }

}
