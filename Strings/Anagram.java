import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("B ina   ry", "Br ainy"));
  }

  public static boolean isAnagram(String x, String y) {
    String newX = x.replace(" ", "").toLowerCase();
    String newY = y.replace(" ", "").toLowerCase();
    if (newX.length() != newY.length()) {
      return false;
    }
    char[] firstString = newX.toCharArray();
    char[] secondString = newY.toCharArray();

    Arrays.sort(firstString);
    Arrays.sort(secondString);

    for (int i = 0; i < firstString.length; i++) {
      if (firstString[i] != secondString[i]) {
        return false;
      }
    }
    return true;
  }
}
