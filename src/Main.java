public class Main {
   public static void main(String[] args) {
      Something s1 = new Something(10);
      Something s3 = s1;
      System.out.println("s1=" + s1.a);
      System.out.println("s3=" + s3.a);
      s3.a = 30;
      System.out.println("s1=" + s1.a);
      System.out.println("s3=" + s3.a);
      System.out.println(); 
      try {
         Something s2 = new Something(20);
         Something s4 = (Something) s2.clone();
         System.out.println("s2=" + s2.a);
         System.out.println("s4=" + s4.a);  
         s4.a = 40;
         System.out.println("s2=" + s2.a);
         System.out.println("s4=" + s4.a);
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
  }
}
