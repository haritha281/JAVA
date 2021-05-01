//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
public class string_methods {
    public static void main(String args[])
    {
        String string1 = new String("hello");
        String string2 = new String("Test string");
        String string3 = new String("HELLO");
        System.out.println("Comparing " + string1 + " and " + string3
                           + " : " + string1.equalsIgnoreCase(string3)); //equalsIgnoreCase()
        System.out.println(string2.startsWith("Test")); //startsWith()
        System.out.println(string2.endsWith("strings")); //endsWith()
        System.out.println(string1.compareTo(string2)); //compareTo()
     }
}
