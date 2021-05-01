/* 1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList */
import java.util.*; 
public class array_list {public static void main(String args[]){ 
 ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom"); 
      alist.add("arvin");
      alist.add("francis");
      alist.add("haritha");
      alist.add("rathnam");
      //displaying elements
      System.out.println(alist);
        //iterating ArrayList
     for(String str:alist)  
        System.out.println(str); 
     //Adding "ruby" at the fourth position
      alist.add(3, "ruby");
      //Removing "Steve"
      alist.remove("Steve");
      //update
      alist.set(1, "Lucy");
      //check particular element
      System.out.println( alist.contains("arvin") );   //true
      //get an element
      System.out.println(alist.get(4));
      //size
      System.out.println(alist.size());
      //present or not
      System.out.println(alist.contains("rathnam"));
      //removing all elements
      alist.clear();
      System.out.println(alist);
}
}