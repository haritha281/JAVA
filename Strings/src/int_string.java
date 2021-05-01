//13. Converting integer objects to Strings
public class int_string {
public static void main(String args[]){  
int i=200  ;  
String s=Integer.toString(i);  
System.out.println(i+100);//300 because + is binary plus operator  
System.out.println(s+100);//200100 because + is string concatenation operator  
}  
}
