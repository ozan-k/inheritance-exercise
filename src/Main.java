public class Main {
   public static void main(String[] argl) {
      Land l1 = new Land(100, 200);
      System.out.println("w: " + l1.getWidth() + ", l: " + l1.getLength() + ", a: " + l1.getArea());

      Land l2 = new Land(500, 4);
      System.out.println("w: " + l2.getWidth() + ", l: " + l2.getLength() + ", a: " + l2.getArea());

      System.out.println("Is l1 equals to l2: " + l1.equals(l2));

      Land l3 = new Land(500, 600);
      System.out.println("w: " + l3.getWidth() + ", l: " + l3.getLength() + ", a: " + l3.getArea());

      System.out.println("Is l1 equals to l3: " + l1.equals(l3));
      System.out.println("Is l2 equals to l3: " + l2.equals(l3));
   }
}
