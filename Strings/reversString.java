public class reversString {

  public static void main(String[] args) {
    reverse("nice");
  }

  public static void reverse(String orignal) {
    String rev = "";
    for (int i = 0; i < orignal.length(); i++) {
      rev = orignal.charAt(i) + rev;
    }

    System.out.println(rev);
  }
}
