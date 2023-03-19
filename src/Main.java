import java.lang.reflect.Field;
    
public class Main {

  public static void main(String[] args) {
    Something s = new Something(7); 
    System.out.println(s.getA());
    s.setA(3);
    System.out.println(s.getA());   

    Class c = s.getClass(); 
    System.out.println(c.getName());
    System.out.println(c.getPackage());

    System.out.println(c.getSuperclass());
      
    Field[] fields = c.getDeclaredFields();
    for (Field field : fields) System.out.println(field);

// getMethods
// getFields
// getConstructors
// getAnnotations

  }
}


