/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the values of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map*/
import java.util.*;
public class hashmap {
  public static void main(String[] args)
    {
        // Create an empty hash map
        HashMap<String, Integer> map = new HashMap<>();
        // Add elements to the map
        map.put("vishal", 1);
        map.put("sachin", 2);
        map.put("vaibhav", 3);
        map.put("haritha", 4);
        map.put("rathnam", 5);
        map.put("arvin", 6);
        map.put("francis",7);
        map.put("ruby", 8);
        map.put("boomer", 9);
        map.put("lucy", 10);
        // Getting the value of 6
        System.out.println("The Value is: " + map.get(12));
        //Displaying the cloned HashMap using clone()
        System.out.println("The cloned map look like this: " + map.clone());
        // Checking for the key_element '20'
        System.out.println("Is the key '20' present? " + map.containsKey(20));
        // Checking for the Value 'boomer'
        System.out.println("Is the value 'boomer' present? " + map.containsValue("boomer"));
        // Checking for the emptiness of Map
        System.out.println("Is the map empty? " + map.isEmpty());
        // Displaying the size of the map
        System.out.println("The size of the map is " + map.size());
        List<String> yourList = new ArrayList<>(map.keySet());
        System.out.println(yourList);
        for (Integer key: map.values()) {
            System.out.println(key);
        }
        // Removing the new key mapping
      map.remove("ruby");
      System.out.println("The Value is: " + map.get(8)); 
      // class Map to clone a map
        Map<Integer, String> new_map
            = new HashMap<Integer, String>();
}
}