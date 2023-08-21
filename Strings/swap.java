public class swap {

  public static void main(String[] args) {
    swapString("first", "second");
    swapNumber(14, 25);
  }

  public static void swapNumber(int a, int b) {
    System.out.println("Before Swapping: " + a + " " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After Swapping: " + a + " " + b);
  }

  public static void swapString(String a, String b) {
    System.out.println("Before Swapping: " + a + " " + b);

    a = a + b;
    b = a.substring(0, a.length() - b.length());
    a = a.substring(b.length());
    // System.out.println(b);

    System.out.println("After Swapping: " + a + " " + b);
  }
}
