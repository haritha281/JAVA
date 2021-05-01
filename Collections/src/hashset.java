//3. Create a HashSet with at least 10 elements of type String
//Write program covering all the operations of HashSet
import java.util.HashSet;
import java.util.*;
 
public class hashset {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();
        // Adding new elements to the HashSet
        set.add("Big Data");
        set.add("Node.js");
        set.add("Java");
        set.add("Python");
        set.add("Blockchain");
        set.add("JavaScript");
        set.add("Selenium");
        set.add("AWS");
        set.add("Machine Learning");
        set.add("RPA");
        // Adding duplicate elements will be ignored
        set.add("Java");
        set.add("RPA");
        System.out.println(set);
        // Check if the HashSet contains an specific element
        String myCourse = "Node.js";
        if(set.contains(myCourse)) {
            System.out.println(myCourse + " is in the courses list.");
        } else {
            System.out.println(myCourse + " is not in the courses list.");
        }
        // Sorting set using List 
        List<String> list = new ArrayList<String>(set); 
        Collections.sort(list);   
        // Printing the sorted elements of the HashSet 
        System.out.println("Printing the Courses in sorted order using List: " + list);
       // Removing items from HashSet using remove() 
        set.remove("Python"); 
        // Iterating over HashSet items 
        System.out.println("Iterating over course list after removing Python:"); 
        Iterator<String> i = set.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());
        // Creating another object of HashSet 
        HashSet<String> set1 = new HashSet<String>(); 
        set1.add("Node.js"); 
        set1.add("Python");
        set1.add("Machine Learning");         
        //Removing all the new elements from HashSet  
        set.removeAll(set1);  
        System.out.println("After invoking removeAll() method courses left: "+ set);     
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("Java"));    
        System.out.println("After invoking removeIf() method: "+ set);          
       // Removing elements from eduCourses which are specified in eduNewCourses 
        set.retainAll(set1);
        System.out.println("HashSet after " + "retainAll() operation : " + set1);   
        //Removing all the elements available in the set   
        set.clear();  
        System.out.println("After invoking clear() method: "+ set); 
        
    }
}
