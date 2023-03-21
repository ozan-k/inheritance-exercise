class Runner {

  public static void main(String[] args) {
    InverseString inv1 = new InverseString("John");
    System.out.println(inv1);

    InverseString inv2 = new InverseString("Jane");
    System.out.println(inv2);

    System.out.println("charAt(2) = " + inv2.charAt(2));
    System.out.println("length() = " + inv2.length());
    System.out.println("subSequence(0, 2) = " + inv2.subSequence(0, 2));
  }

}
