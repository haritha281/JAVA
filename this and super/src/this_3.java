//3. Call constructor of the current class using this()
class this_3{   
    this_3(){  
    this("Hi"); 
    System.out.println("Inside constructor without parameter");  
      } 
    this_3(String str){
      System.out.println("Inside constructor with string parameter as "+str);    
    }
public static void main(String args[]){ 
    this_3 obj=new this_3();
}
}

