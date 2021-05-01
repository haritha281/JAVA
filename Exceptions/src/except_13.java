//13. Write a program to generate NoSuchFieldException
import java.lang.reflect.Field;
public class except_13 {
    public int num;  
    public static void main(String args[]) throws NoSuchFieldException {  
        Class<except_13> obj = except_13.class;  
        Field fields = obj.getField("num");  
        System.out.println(fields);  
        Class<?> tp = fields.getType();  //gets the type   
        System.out.println(tp);  
    }  
}
