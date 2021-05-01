//14.Write a program to generate NoSuchMethodException

public class except_14  {
    private String key = null;
    private Integer value;
     
    public except_14(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
     
    public String getKey() {
        return this.key;
    }
     
    public Integer getValue() {
        return this.value;
    }
    public static void main(String args[]) {
    except_14 obj=new except_14("key",20);
    System.out.println(obj.getValue());
   // System.out.println(obj.getValues()); throws NoSuchMethodException
    }

}

